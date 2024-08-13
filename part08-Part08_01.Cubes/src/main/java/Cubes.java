
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cube cube = new Cube();
        UserInterface ui = new UserInterface(scanner, cube);
        
        ui.start();
    }
}
