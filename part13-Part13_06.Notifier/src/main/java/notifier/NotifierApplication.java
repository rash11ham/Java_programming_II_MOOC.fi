package notifier;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{

    @Override
    public void start(Stage window){
        TextField text = new TextField("write here...");
        Button button = new Button("Update");
        Label label = new Label("");
        
        button.setOnAction((event)->{
            label.setText(text.getText());
        });
        VBox vb = new VBox();
        vb.getChildren().addAll(text,button,label);
        
        Scene scene = new Scene(vb);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
