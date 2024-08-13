
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Employees {
    private List<Person> persons;

    public Employees() {
        this.persons = new ArrayList();
    }
    
    public void add(Person personToAdd){
        this.persons.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        peopleToAdd.stream().forEach(a -> this.persons.add(a));
    }
    
    public void print(){
        Iterator<Person> iterator = this.persons.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education){

        Iterator<Person> iterator = this.persons.iterator();
        while(iterator.hasNext()){
            Person person = iterator.next();
            if(education == person.getEducation()){
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = this.persons.iterator();
        while(iterator.hasNext()){
            if(education.equals(iterator.next().getEducation())){
                iterator.remove();
            }
            
        }
    }
    
}
