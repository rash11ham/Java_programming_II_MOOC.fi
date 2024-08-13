
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container = new Container();

        while (true) {
            System.out.println(container);
            System.out.println("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] str = input.split(" ");
            String command = str[0];
            int value = Integer.valueOf(str[1]);
            
            if(command.equals("add")){
                container.addLiters(value);
            }
            if(command.equals("move")){
                container.moveLiters(value);
            }
            if(command.equals("remove")){
                container.removeLiters(value);
            }
            
            
        }
    }

}
