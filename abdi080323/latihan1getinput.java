import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan1getinput {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in ));
        Int number = 0;
        char letter = '';
        int result = 0;
        String str = "";
    
        try{
            System.out.print("Number = ");
            number = Integer.parseInt(dataIn.readLine());
        } catch (IOException e){
            System.out.println("Error!");
        }

        try{
            System.out.print("Char = ");
            char = dataIn.readLine();
        } catch (IOException e){
            System.out.println("Error!");
        }
        System.out.println("Hello " +number+ "!");
    }
}