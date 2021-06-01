package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//Anytime you want to handle user events u got to implement the EventHandler interface
public class Main extends Application {
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("This is the primary stage or window" );
        button = new Button();
        button.setText("This is a button");

        // You can set an anonymous function using lambda inside the button to handle events
        button.setOnAction(e-> System.out.println("hi"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);


        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
