
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> numbers = new ArrayList();
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            
            String input = scanner.nextLine();
            if(input.equals("end")){
                
                break;
            }
            
            numbers.add(input);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? \n(n/p)");
        String input = scanner.nextLine();
        if(input.equals("n")){
            double stream = numbers.stream().mapToInt(i -> Integer.valueOf(i))
                .filter(f -> f < 0)
                .average().getAsDouble();
            System.out.println("average of the negative numbers: "+stream);
        }
        if(input.equals("p")){
            double stream = numbers.stream().mapToInt(i -> Integer.valueOf(i))
                .filter(f -> f > 0)
                .average().getAsDouble();
            System.out.println("average of the positive numbers: "+stream);
        }
        
        
    
    }
}
