import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.shape.*;

/**
 *      This program moves a ball when clicking buttons.
 *
 *      Date last Modified: 09/28/2023
 *      @author Alex Baker, Chris Sargent
 *
 *      CS1122, Fall 2023
 *      Lab Section 2
 *
 */

public class Week6LabProblem3 extends Application {

    public void start(Stage stage){

        //defines the buttons and the border pane objects
        BorderPane pane = new BorderPane();
        Button button = new Button("Move Left");
        Button button2 = new Button("Move Right");
        Button button3 = new Button("Move Up");
        Button button4 = new Button("Move Down");

        //makes the hboxes and vboxes
        VBox lVbox = new VBox(button);
        VBox rVBox = new VBox(button2);
        HBox tHbox = new HBox(button3);
        HBox bHbox = new HBox(button4);


        lVbox.setAlignment(Pos.CENTER);
        rVBox.setAlignment(Pos.CENTER);
        tHbox.setAlignment(Pos.CENTER);
        bHbox.setAlignment(Pos.CENTER);

        //Makes the buttons resize to the window size
        HBox.setHgrow(button3, Priority.ALWAYS);
        HBox.setHgrow(button4, Priority.ALWAYS);
        button3.setMaxWidth(Double.MAX_VALUE);
        button4.setMaxWidth(Double.MAX_VALUE);
        button3.setMaxHeight(Double.MAX_VALUE);
        button4.setMaxHeight(Double.MAX_VALUE);
        VBox.setVgrow(button, Priority.ALWAYS);
        VBox.setVgrow(button2, Priority.ALWAYS);
        button.setMaxWidth(Double.MAX_VALUE);
        button2.setMaxWidth(Double.MAX_VALUE);
        button.setMaxHeight(Double.MAX_VALUE);
        button2.setMaxHeight(Double.MAX_VALUE);

        Circle ball = new Circle(100, 100, 25);
        Pane ballPane = new Pane(ball);


        //button actions to make the ball move in the right directions
        button.setOnAction(
                (ActionEvent event) -> {
                    ball.setLayoutX(ball.getLayoutX() - 10);
                }
        );
        button2.setOnAction(
                (ActionEvent event) -> {
                    ball.setLayoutX(ball.getLayoutX() + 10);
                }
        );
        button3.setOnAction(
                (ActionEvent event) -> {
                    ball.setLayoutY(ball.getLayoutY() - 10);
                }
        );
        button4.setOnAction(
                (ActionEvent event) -> {
                    ball.setLayoutY(ball.getLayoutY() + 10);
                }
        );

        pane.setLeft(lVbox);
        pane.setRight(rVBox);
        pane.setTop(tHbox);
        pane.setBottom(bHbox);
        pane.setCenter(ballPane);

        Scene scene = new Scene(pane, 400, 300 );
        stage.setTitle("Increase and decrease button");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) { launch(args); }
}