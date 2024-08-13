

public class Checker {    

    public boolean isDayOfWeek(String string){
        String regex = "mon|tue|wed|thu|fri|sat|sun";
        return this.match(string, regex);
        
    }    
        
    public boolean allVowels(String string){
        String regex = "(a?e?i?o?u?)+";
        return this.match(string, regex);
    }
    
       
    public boolean timeOfDay(String string){
        String regex = "^((0[0-9]|1[0-9]|2[0-3])(:[0-5][0-9])(:[0-5][0-9]))\\b";
        return this.match(string, regex);
    }    
       
    public void checker(String string){
        if(this.isDayOfWeek(string)){
            System.out.println("The form is correct.");
        } else if(this.allVowels(string)){
            System.out.println("The form is correct.");
        } else if(this.timeOfDay(string)){
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }   
    public boolean match(String string, String regex){
        if(string.matches(regex)){
            return true;
        }
        return false;
    }
}
