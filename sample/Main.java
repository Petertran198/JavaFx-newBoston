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

//Anytime you want to handle user events u got to implement the EventHandler interface
public class Main extends Application {
    Button button1, button2;
    Scene scene1, scene2;
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("This is the primary stage or window" );

        //Vbox lays  things out in a  vertical column spaced out 8 pxl
        VBox layout1 = new VBox(8);
        //----Items created to add to layout -------
        Label label1 = new Label("Welcome to the first scene");
        //Create button to put in scene 1
        button1 = new Button("Click to go to scene 2 ");
        // do something when clicked
        button1.setOnAction(e-> {
            primaryStage.setScene(scene2);
        });
        //add items to layout 1 and then..
        layout1.getChildren().addAll(label1, button1);
        // set layout1 to be the first scene
        scene1= new Scene(layout1, 500, 500);

        //Make layout2 for second scene using stack-pane
        // it places all the element into a single stack where every new item gets placed on the top of the previous one
        StackPane layout2 = new StackPane();
        //----Items created to add to layout -------
        button2 = new Button("Click to go back to scene 1 ");
        button2.setOnAction(e-> {
            primaryStage.setScene(scene1);
        });
        //Add items to layout2
        layout2.getChildren().addAll(button2);
        //set layout2 to be second scene
        scene2 = new Scene(layout2, 500, 500);

        //Show the first scene
        primaryStage.setScene(scene1);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
