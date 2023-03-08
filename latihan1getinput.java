import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard2 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in ));
        Int number = 0;
        char letter = '';
        int result = 0;
        String str = "";
        System.out.print("Number = ");
        try{
            number = Integer.parseInt(dataIn.readLine());
        } catch (IOException e){
            System.out.println("Error!");
        }
        System.out.println("Hello " +number+ "!");
    }
}