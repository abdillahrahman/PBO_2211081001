package abdi070323;

public class ContohIncrement {
    public static void main(String [] args){
        int i = 10;
        int j = 3;
        int k = 0;
        
        k = j++ + i;
        //k = ++j + i;
        
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
