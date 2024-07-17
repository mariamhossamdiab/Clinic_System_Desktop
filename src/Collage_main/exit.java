
package Collage_main;
import javax.swing.JOptionPane;
import GUI.*;
public class exit {
    public void exit() throws InterruptedException{
        ///buttom exit 
        
     try{
        Thread.sleep(2000);
        
           login_page Login = new login_page();
         Login.setVisible(true);
           
     }
     catch(InterruptedException ex){
         
         JOptionPane.showConfirmDialog(null,"Erorr");      
     }   
 
   
    }
 }






