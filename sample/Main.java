package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//Anytime you want to handle user events u got to implement the EventHandler interface
public class Main extends Application implements EventHandler<ActionEvent> {
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("This is the primary stage or window" );
        button = new Button();
        button.setText("This is a button");
        button.setOnAction(this); // this is just saying the code to handle the event action of this button is in this class (aka the handleEvent method) instead of another file

        StackPane layout = new StackPane();
        layout.getChildren().add(button);


        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    // Called when the user clicks or handle an event
    public void handle(ActionEvent actionEvent) {
        if (actionEvent.getSource()== button ){
            System.out.println("Oh I love it when u touched me there");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
