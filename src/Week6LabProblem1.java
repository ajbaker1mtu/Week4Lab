import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.stage.*;
import javafx.scene.paint.*;
import java.lang.Math;

/**
 *      This program creates a 4-cusped astroid.
 *
 *      Date last Modified: 09/28/2023
 *      @author Alex Baker, Chris Sargent
 *
 *      CS1122, Fall 2023
 *      Lab Section 2
 *
 */
public class Week6LabProblem1 extends Application {
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400 );
        for(double i = 0; i < 50; i+= (Math.PI)/48){  //Uses math we came up with to generate many lines in the right pattern
            Line line = new Line(Math.cos(i)*200+200, 200, 200, Math.sin(i)*200+200);
            line.setStroke(Color.rgb(255, 0, 0));
            line.setStrokeWidth(1);
            root.getChildren( ).add(line);
        }


        stage.setTitle("My JavaFX Aplication");
        stage.setScene(scene);
        stage.show();
    }


 public static void main(String[] args) { launch(args); }
}





