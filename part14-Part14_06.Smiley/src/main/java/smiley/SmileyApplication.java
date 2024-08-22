package smiley;

import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class SmileyApplication extends Application{

    @Override
    public void start(Stage window) {

        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        ColorPicker colorPalette = new ColorPicker();

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        
        painter.fillRect(200, 50,50, 50);
        painter.fillRect(400, 50,50, 50);
        painter.fillRect(100, 250,50, 50);
        painter.fillRect(500, 250,50, 50);
        painter.fillRect(150, 300,350, 50);

        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
