package abdi120423;

public class StudentRecordExample {
    public static void main( String[] args ){
    StudentRecord annaRecord = new StudentRecord();

    //Memberi nama siswa
    annaRecord.setName("Anna");

    //Menampilkan nama siswa
    System.out.println(annaRecord.getName() );

    //Menampilkan jumlah siswa
    System.out.println("Count = "+StudentRecord.getStudentCount());
    }

    class CobaOverride extends StudentRecord {
    @Override
        public String getName(){
        System.out.println("Anna merupakan student");
        return name;
        }
    }
}
