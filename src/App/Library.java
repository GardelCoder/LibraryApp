/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;
import Entities.Bill;
import Entities.Person;
import Entities.Book;
import Entities.Item;
/**
 *
 * @author ratzinger
 */
public class Library {
    
    public static void main(String[] args) {
        
        Person p = new Person(36124099, "Leonardo Barberis");
        Book b = new Book(1,"The Bible");
        Bill bill = new Bill(12135,145);
        Item item = new Item(b, 1);
        
        System.out.println(p.toString()+" has "+item.toString()+", and it cost "+bill.getPrice()+"$");
        
    }
    
}
