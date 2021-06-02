package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.AlertBox;

//Anytime you want to handle user events u got to implement the EventHandler interface
public class Main extends Application {
    Button button;
    Scene scene1;
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("This is the primary stage or window" );

        // pick layout display and make it
        StackPane layout = new StackPane();
        // Make items to put in layout
        button = new Button("Button 1 ");
        button.setOnAction(e-> {
            AlertBox.display("secondary window", "Please close if you want to return");
        });
        layout.getChildren().addAll(button);
        // Add layout to scene 1
        scene1 = new Scene(layout, 500, 500);

        // Show Scene
        primaryStage.setScene(scene1);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
