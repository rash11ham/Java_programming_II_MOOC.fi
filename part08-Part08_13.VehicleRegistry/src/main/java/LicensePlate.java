
import java.util.HashMap;
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    public boolean equals(Object plate){
        if(this == plate){
            return true;
        }
        if(!(plate instanceof LicensePlate)){
            return false;
        }
        final LicensePlate other = (LicensePlate) plate;
        if(this.country.equals(other.country) && 
                this.liNumber.equals(other.liNumber)){
            return true;
        }
        return false;
    }
    
    public int hashCode(){
          if(this.country == null){
              return this.liNumber.hashCode();
          }
          return this.country.hashCode()+this.liNumber.hashCode();
    }
    
    

}
