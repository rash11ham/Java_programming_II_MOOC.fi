
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
       HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }
    public static void printKeys(HashMap<String,String> hashmap){
        for (String variableName : hashmap.keySet())
        {
            String variableKey = variableName;
            System.out.println(variableKey);           
        }
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for (String variableName : hashmap.keySet())
        {
            if(variableName.contains(text)){
                String variableKey = variableName;
                System.out.println(variableKey); 
            }           
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for (String variableName : hashmap.keySet())
        {
            if(variableName.contains(text)){
                String variableKey = variableName;
                String value = hashmap.get(variableKey);
                System.out.println(value); 
            }           
        }
    }

}
