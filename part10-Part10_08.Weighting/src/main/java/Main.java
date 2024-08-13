
import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        
        Suitcase suit = new Suitcase(20);
        ArrayList<Item> items = new ArrayList();
        
        items.add(new Item("book", 2));
        items.add(new Item("bo", 2));
        items.add(new Item("ook", 2));
        items.add(new Item("bk", 2));
        
        int summa = items.stream()
                .mapToInt(i -> i.getWeight())
                .sum();
                
       System.out.println(summa);
       items.stream()
                .forEach(i -> System.out.println(i));
    }

}
