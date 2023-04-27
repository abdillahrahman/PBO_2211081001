<<<<<<< HEAD
=======
package abdi080323;

>>>>>>> 41e555c (latihan)
import java.io.BufferedReader;
import java.io.inputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in ));
        String name = "";
        int nilai = 0;
        System.out.print("Please Input Name = ");
        try{
            System.out.print("Please Input Name = ");
            name = dataIn.readLine();
            System.out.print("Nilai Matematika = ");
            nilai = Integer.parseInt(dataIn.readLine());
        } catch (IOException e){
            System.out.println("Error!");
        }
        System.out.println("Hello " +name+ "!");
        System.out.println("Nilai Matematika = "+nilai);
    }
}
