
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> average = new ArrayList();
        
        UserInterface ui = new UserInterface(scanner, average);
        
        ui.start();

    }
}
