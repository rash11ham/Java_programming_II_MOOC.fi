package buttonandtextfield;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application{


    @Override
    public void start(Stage window){
        Button button = new Button("Button");
        TextField tf = new TextField("TextField");
        
        FlowPane buttonImplication = new FlowPane();
        buttonImplication.getChildren().add(button);
        buttonImplication.getChildren().add(tf);
        
        
        
        Scene scene = new Scene(buttonImplication);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
