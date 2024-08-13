
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String input = scanner.nextLine();
            
            if(input.equals("stop")){
                break;
            }
            if(input.equals("add")){
                System.out.println("Task: ");
                String add = scanner.nextLine();
                this.todoList.add(add);
            }
            if(input.equals("list")){
                this.todoList.print();
            }
            if(input.equals("remove")){
                System.out.println("Which task is to be removed? ");
                int index = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(index);
            }
        }
    }
    
}
