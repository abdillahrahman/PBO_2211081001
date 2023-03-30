package abdi300323;

public class EqualTest {
    public static void main(String[] args){
        String str1, str2;
        str1 = "free the bound periodicals.";
        str2 = str1;

        System.out.println("String: " + str1);
        System.out.println("String: " + str2);
        System.out.println("Same object?" + (str1 == str2));

        str2 = new String(str1);

        System.out.println("String: "+ str1);
        System.out.println("String: " + str2);
        System.out.println("Same object? " + (str1 == str2));
        System.out.println("Same value? " + str1.equals(str2));
    }
    
}
