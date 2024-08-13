
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        
        HashMap<String, String> name = new HashMap();
        
        name.put("matthew","matt");
        name.put("michael","mix");
        name.put("arthur","artie");
        
        System.out.println("matthew's nickname is "+name.get("matthew"));
        System.out.println("michael's nickname is "+name.get("michael"));
        System.out.println("arthur's nickname is "+name.get("arthur"));
    }

}
