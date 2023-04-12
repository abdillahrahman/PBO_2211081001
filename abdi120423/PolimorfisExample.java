package abdi120423;

public class PolimorfisExample {
    public static void main(String[] args){
        Person ref;
        Student student = new Student();
        Employee emp = new Employee();
        student.setName("Budi");
        student.setAddress("padang");
        emp.setName("Doni");
        emp.setAddress("Bukittinggi");

        ref = student;
        String temp = ref.getName();
        System.out.println(temp);

        ref = emp;
        String temp1 = ref.getName();
        System.out.println(temp1);
    
        printInformation(student);
        printInformation(emp);
    }

    public static void printInformation(Person p){
        if(p instanceof Student){
            System.out.println("Nama Student : "+p.getName());
            System.out.println("Alamat Student : "+p.getAddress());
        }
        else if(p instanceof Employee){
            System.out.println("Name Employee : "+p.getName());
            System.out.println("Alamat Emplyee : "+p.getAddress());
        }
    }
}
