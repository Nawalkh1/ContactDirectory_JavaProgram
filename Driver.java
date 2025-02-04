/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactdirectory;
import java.util.GregorianCalendar;
/**
 *
 * @author Nawal khan 
 */
public class Driver {
    public static void main(String [] arg){
        Contact contact0 = new Contact("Super", "Man", new String[]{"03434897981","89082983"}, "disney world","super hero", "", new GregorianCalendar(1867, 3, 3) );
        Contact contact1 = new Contact("Bean","",new String[]{"28392837428"});
        
        Contact contact2 = new Contact("Saima",new String[]{"984283"});
        
        
        Contact list[] = new Contact[]{contact0,contact1, contact2,null, null, null};
        
        Directory dir = new Directory(list,3);
        Directory myDirectory = new Directory(50);
        
    }
}
