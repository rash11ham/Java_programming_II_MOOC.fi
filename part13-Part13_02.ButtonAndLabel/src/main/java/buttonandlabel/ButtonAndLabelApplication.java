package buttonandlabel;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application{

    @Override
    public void start(Stage window){
        Button button = new Button("Button");
        Label label = new Label("Label");
        
        FlowPane buttonImplication = new FlowPane();
        buttonImplication.getChildren().add(label);
        buttonImplication.getChildren().add(button);
        
        
        Scene scene = new Scene(buttonImplication);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
