
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("How many random numbers should be printed?");
        int number = Integer.valueOf(scanner.nextLine());
        int i = 0;
        while(i<number){
            int rand = random.nextInt(11);
            System.out.println(rand);
            i++;
        }
    }

}
