/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;
import Entities.Person;
import Entities.Book;
/**
 *
 * @author ratzinger
 */
public class Library {
    
    public static void main(String[] args) {
        
        Person p = new Person(36124099, "Leonardo Barberis");
        Book b = new Book(1,"The Bible");
        System.out.println(p.toString()+" has "+b.toString());
        
    }
    
}
