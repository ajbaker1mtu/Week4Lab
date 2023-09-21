import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

import java.util.concurrent.atomic.AtomicInteger;

import javafx.event.*;


public class Week6LabProblem2 extends Application {
    public void start(Stage stage) {

//        BorderPane pane1 = new BorderPane();
        AtomicInteger count = new AtomicInteger();
        Button button = new Button("Decrease");
        Button button1 = new Button("Increase");
        Label label = new Label(String.valueOf(count.get()));
        Pane pane = new Pane(button, button1, label);
        button1.relocate(140,0);

        label.relocate(95, 5);

        button.setOnAction(
                (ActionEvent event) -> {
                    count.getAndDecrement();
                 label.setText(String.valueOf(count.get()));
            });
        button1.setOnAction(
                (ActionEvent event) -> {
                    count.getAndIncrement();
                    label.setText(String.valueOf(count.get()));
                });

        Scene scene = new Scene(pane, 200, 30 );
        stage.setTitle("Increase and decrease button");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) { launch(args); }
}
