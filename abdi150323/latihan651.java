package abdi150323;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan651 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in ));
        int a;
        int b;
        int c;


    try{
            System.out.print("Entri Nilai A : ");
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri Nilai B : ");
            b = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri Nilai C : ");
            c = Integer.parseInt(dataIn.readLine());
            int d = (a + b + c)/3;
            System.out.println("Rata Rata : "+d);

            int grade = 60;
        if( d >= grade ) 
            System.out.println("Congratulations, you passed :-)");
        else 
            System.out.println("Im sorry, you not passed :-(");
        
        }   catch(Exception ex){
            System.out.println("Error !");
        }

        

    }

}   
