package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{

    
    @Override
    public void start(Stage window) {

        BorderPane bp = new BorderPane();
        Label label = new Label("First view!");
        bp.setTop(label);
        Button button = new Button("To the second view!");
        bp.setCenter(button);


        VBox vb = new VBox();
        Button forth = new Button("To the third view!");
        Label label2 = new Label("First view!");
        vb.getChildren().addAll(forth,label2);

        GridPane layout = new GridPane();
        Button thirdButton = new Button("To the first view!");
        for (int x = 0; x <= 2; x++) {
          for (int y = 0; y <= 2; y++) {
              if(x == 0 && y == 0)
                  layout.add(new Label("Third view!"), x, y);
              if(x == 1 && y == 1)
                  layout.add(thirdButton, x, y);
          }
        }

        Scene first = new Scene(bp);
        Scene second = new Scene(vb);
        Scene third = new Scene(layout);

        button.setOnAction((event) -> {
            window.setScene(second);
        });

        forth.setOnAction((event) -> {
            window.setScene(third);
        });

        thirdButton.setOnAction((event)->{
            window.setScene(first);
        });

        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
