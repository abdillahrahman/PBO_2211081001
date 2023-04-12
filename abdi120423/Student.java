package abdi120423;

public class Student extends Person {

    public Student(){
        super("Budi","padang");
        System.out.println("Inside Student:Constructor");
    }

    public String getName(){
        System.out.println("getName Student");
        return name;
    }
    
    public static void main(String[] args){
        Student student = new Student();
        student.name = "Ali";
        student.address = "padang";
    }
}