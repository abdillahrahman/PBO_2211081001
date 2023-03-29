package abdi290323;

public class CommandLineAritmatik{

public static void main(String[] args){
    int a,b,sum,dif,pro,quo;
    a = Integer.parseInt(args[0]);
    b = Integer.parseInt(args[1]);
    
    sum = a+b;
    dif = a-b;
    pro = a*b;
    quo = a/b;


    System.out.println("sum = " +sum);
    System.out.println("difference = " +dif);
    System.out.println("product = " +pro);
    System.out.println("quotient = " +quo);
    }
}