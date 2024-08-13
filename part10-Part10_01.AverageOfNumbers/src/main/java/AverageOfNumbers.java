
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> numbers = new ArrayList();
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            
            numbers.add(input);
        }
        double stream = numbers.stream().mapToInt(i -> Integer.valueOf(i))
                .average().getAsDouble();
        
        System.out.println("average of the numbers: "+stream);

    }
}
