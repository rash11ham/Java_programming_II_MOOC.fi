
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList();
        while(true){
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.println("Input the age recommendation: ");
            int ageRecon = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(name, ageRecon));
            
            
        }
        System.out.println(books.size()+" books in total.\n");
        System.out.println("Books:");
        Comparator<Book> comarator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getName);
        Collections.sort(books,comarator);
        books.stream()
                .forEach(a -> System.out.println(a));
        
    }

}
