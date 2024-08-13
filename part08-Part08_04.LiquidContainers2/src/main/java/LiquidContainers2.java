
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: "+first);
            System.out.println("Second: "+second);
            System.out.println("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] str = input.split(" ");
            String command = str[0];
            int value = Integer.valueOf(str[1]);
            
            if(command.equals("add")){
                first.add(value);
            }
            if(command.equals("move")){
                first.move(value, second);
            }
            if(command.equals("remove")){
                second.remove(value);
            }
        }
    }

}
