package application;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application{

    private HashMap<String, Map<Integer,Double>> dataFromFile;

    public PartiesApplication() {
        this.dataFromFile = this.readDataFromFile("partiesdata.tsv");
    }
    
    @Override
    public void start(Stage window){
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        
        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");
        
        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
        chart.setTitle("Relative support of parties");
        
        // create the data set that is going to be added to the line chart
        this.dataFromFile.keySet().stream().forEach(party -> {
            //creates the object for data set
            XYChart.Series dataSet = new XYChart.Series<>();
            dataSet.setName(party);
            this.dataFromFile.get(party).entrySet().stream().forEach(pair -> {
                dataSet.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });
            //add to the chart
            chart.getData().add(dataSet);
        });
        
        //Scene object to display 
        Scene view = new Scene(chart);
        window.setScene(view);
        window.show();
        
    }
    
    private HashMap<String, Map<Integer, Double>> readDataFromFile(String dataFile){
        ArrayList<Integer> yearsList = new ArrayList();
        HashMap<String, Map<Integer,Double>> tempMap = new HashMap();
        
        try(Scanner scanner = new Scanner(Paths.get(dataFile))){
            
            String[] firstLine = scanner.nextLine().split("\t");
            for(int i=1; i<firstLine.length; i++){
                yearsList.add(Integer.valueOf(firstLine[i]));
            }
            
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split("\t");
                String party = parts[0];
                
                HashMap<Integer, Double> values = new HashMap();
                for(int i=1; i<parts.length; i++){
                    if(!parts[i].equals("-")){
                        int year = yearsList.get(i-1);
                        double value = Double.valueOf(parts[i]);
                        values.put(year, value);
                    }
                }
                tempMap.put(party, values);
            }
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        
        return tempMap;
    }
    
    
    public static void main(String[] args) {
        
        launch(PartiesApplication.class);
    }

}
