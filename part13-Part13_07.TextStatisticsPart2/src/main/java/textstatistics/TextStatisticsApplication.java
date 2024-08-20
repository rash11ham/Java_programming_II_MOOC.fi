package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{


    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        
        
        HBox textComponents = new HBox();
      
        Label charCount = new Label("Letters: ");
        Label wordCount = new Label("Words: ");
        Label longestWord = new Label("The longest word is:");
        textComponents.getChildren().addAll(charCount,wordCount,longestWord);
       
        textComponents.setSpacing(20);
        TextArea textArea = new TextArea("");
        
        textArea.textProperty().addListener((change,oldValue,newValue)->{
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1,s2)-> s2.length() - s1.length())
                    .findFirst()
                    .get();
            charCount.setText("Letters: "+characters);
            wordCount.setText("Words: "+words);
            longestWord.setText("The longest word is: "+longest);
        });
        layout.setCenter(textArea);
        layout.setBottom(textComponents);
        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
