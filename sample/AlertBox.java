package sample;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class AlertBox {
    public static void display(String title, String message){
        Stage window = new Stage();
        window.setTitle(title);
        window.setMinWidth(250);


        // This allows us to block input event from other windows until this is taken care of
        window.initModality(Modality.APPLICATION_MODAL);

        // Message that will appear in the alert, passed via params
        Label label = new Label(message);

        //Create button to close window
        Button closeButton = new Button("Close the window");
        closeButton.setOnAction(e-> {
            window.close();
        });

        // Create layout for Scene like always
        VBox layout = new VBox(8);
        //Add items to layout
        layout.getChildren().addAll(label, closeButton);
        // Set alignment to layout
        layout.setAlignment(Pos.CENTER);
        // Create Scene
        Scene scene = new Scene(layout, 500, 500);

        window.setScene(scene);
        //This shows the stage and wait until it becomes hidden or CLOSE  works with init-modality on top
        window.showAndWait();
    }
}
