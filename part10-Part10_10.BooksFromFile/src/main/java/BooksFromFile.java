
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        System.out.println(readBooks("stderr.txt"));

    }
    public static List<Book> readBooks(String file){
        ArrayList<Book> books = new ArrayList();
        
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .map(splits -> new Book(splits[0],Integer.valueOf(splits[1]), Integer.valueOf(splits[2]), splits[3]))
                    .forEach(book -> books.add(book));
            
        } catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        return books;
    }
}
