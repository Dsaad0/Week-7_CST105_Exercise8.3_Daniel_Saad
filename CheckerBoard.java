/* Program:  CheckBoard
  * File:     CheckBoard.java
  * Summary:  Create and displaychecker board pattern
  * Author:   Daniel Saad
  * Date:     12/22/18
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CheckerBoard extends Application {

    @Override
    public void start(Stage primaryStage) {
        //create aleternating black and white blocks
        GridPane pane = new GridPane();
        boolean isBlack = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle rec = new Rectangle(25, 25, (isBlack) ? Color.BLACK : Color.WHITE);
                pane.add(rec, j, i);
                isBlack = !isBlack;
            }
            isBlack = !isBlack;
        }
        //create scene window
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Checker Board");
        primaryStage.setMinHeight(200);
        primaryStage.setMinWidth(200);
        primaryStage.show();
    }

    public static void main(String[] args) {

        Application.launch(args);
    }
}
