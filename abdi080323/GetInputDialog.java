<<<<<<< HEAD
=======
package abdi080323;

>>>>>>> 41e555c (latihan)
import javax.swing.JOptionPane;

public class GetInputDialog{
       public static void main( String[] args ){
        String name = "";
        name = JOptionPane.showInputDialog("Please enter your name");

        String msg = "Hello " + name + "!";

        JOptionPane.showMessageDialog(null, msg);
         }
} 