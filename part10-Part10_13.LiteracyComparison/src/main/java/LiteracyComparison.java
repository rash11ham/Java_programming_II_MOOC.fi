
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Litracy> list = new ArrayList();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(","))
                    .map(piece -> new Litracy(piece[3], piece[2].replace("(%)","").trim(), Integer.valueOf(piece[4]), Double.parseDouble(piece[5])))
                    .forEach(p -> list.add(p));
        } catch (IOException ex) {
            System.out.println("Error reading file.");
        }
        
        list.stream().sorted((p1,p2) -> {
                      return p1.compareTo(p2);
                   })
                   .forEach(p -> System.out.println(p));
        
    }
}
