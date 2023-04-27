<<<<<<< HEAD
=======
package abdi080323;

>>>>>>> 41e555c (latihan)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputInt {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in ));
        int a;
        int b;

        try{
            System.out.print("Entri Nilai A : ");
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri Nilai B : ");
            b = I12nteger.parseInt(dataIn.readLine());
            int c = a + b;
            System.out.println("Hasil C : "+c);
        }   catch(Exception ex){
        }
    }
}

