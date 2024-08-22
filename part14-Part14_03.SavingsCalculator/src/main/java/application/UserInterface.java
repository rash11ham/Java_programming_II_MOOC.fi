/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author rashe
 */
public class UserInterface extends Application{
    
    @Override
    public void start(Stage stage){
        BorderPane layout = new BorderPane();
        
        BorderPane savingPane = new BorderPane();
        
        BorderPane interestPane = new BorderPane();
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis(2500, 25000, 2500);
        
        
        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
        chart.setTitle("Savings calculator");
        
        XYChart.Series savings = new XYChart.Series();
        XYChart.Series savingsWithInterest = new XYChart.Series();

        chart.getData().addAll(savings, savingsWithInterest);
        
        Slider sliderSavings = new Slider(25, 250, 25);
        sliderSavings.setShowTickMarks(true);
        sliderSavings.setShowTickLabels(true);
        Label labelSavings = new Label("Monthly savings");
        Label monthlySaving = new Label(""+sliderSavings.getValue());
        
        
        
        Slider sliderInterest = new Slider(0, 10, 0);
        sliderInterest.setShowTickMarks(true);
        sliderInterest.setShowTickLabels(true);
        sliderInterest.adjustValue(0);
        Label labelInterest = new Label("Yearly interest rate");
        Label annualIntRate = new Label(""+sliderInterest.getValue());
        
        savingPane.setPadding(new Insets(20, 20, 20, 20));
        savingPane.setMargin(labelSavings,new Insets(10));
        savingPane.setMargin(sliderSavings,new Insets(10));
        savingPane.setMargin(monthlySaving,new Insets(10));
        savingPane.setLeft(labelSavings);
        savingPane.setCenter(sliderSavings);
        savingPane.setRight(monthlySaving);
        
        
        interestPane.setPadding(new Insets(20, 20, 20, 20));
        interestPane.setMargin(labelInterest,new Insets(10));
        interestPane.setMargin(sliderInterest,new Insets(10));
        interestPane.setMargin(annualIntRate,new Insets(10));
        interestPane.setLeft(labelInterest);
        interestPane.setCenter(sliderInterest);
        interestPane.setRight(annualIntRate);
        
        
        
        
        sliderSavings.valueProperty().addListener((observable, oldNumber, newValue) -> {           
                monthlySaving.setText(""+Math.round(newValue.doubleValue()*100.0)/100.0);
                this.updateSavings(sliderSavings.getValue(), sliderInterest.getValue(), savings, savingsWithInterest);
        });
        sliderInterest.valueProperty().addListener((observable, oldNumber, newValue) -> {           
                annualIntRate.setText(""+Math.round(newValue.doubleValue()*100.0)/100.0);
                this.updateSavings(sliderSavings.getValue(), sliderInterest.getValue(), savings, savingsWithInterest);
        });
        
        
        this.updateSavings(sliderSavings.getValue(), sliderInterest.getValue(), savings, savingsWithInterest);
        

        VBox vBox = new VBox(savingPane,interestPane);
        vBox.setSpacing(5);
        layout.setTop(vBox);
        
       
        layout.setCenter(chart);
        
        Scene view = new Scene(layout,900,800);
        stage.setScene(view);
        stage.show();
    }
    
    private void updateSavings(double savings, double interestRate, XYChart.Series savingsSeries, XYChart.Series savingsWithInterestSeries) {
        savingsSeries.getData().clear();
        savingsWithInterestSeries.getData().clear();

        savingsSeries.getData().add(new XYChart.Data(0, 0));
        savingsWithInterestSeries.getData().add(new XYChart.Data(0, 0));

        double savs = 0.0;
        double intrs = 0.0;

        for (int i = 1; i <= 30; i++) {            
            savs += savings * 12;
            intrs = (intrs + savings * 12) * (1.0 + interestRate / 100.0);
            
            savingsSeries.getData().add(new XYChart.Data(i, savs));
            savingsWithInterestSeries.getData().add(new XYChart.Data(i, intrs));
        }
    }

}
