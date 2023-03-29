package abdi150323;

import javax.swing.JOptionPane;

public class latihan6512 {
    public static void main(String[] args){
    String n1, n2, n3;
    int nilai1, nilai2, nilai3, grade;

    n1 = JOptionPane.showInputDialog("Masukan nilai A : ");
    nilai1 = Integer.parseInt(n1);
    n2 = JOptionPane.showInputDialog("Masukan nilai B : ");
    nilai2 = Integer.parseInt(n2);
    n3 = JOptionPane.showInputDialog("Masukan nilai C :");
    nilai3 = Integer.parseInt(n3);

    grade = (nilai1 + nilai2 + nilai3)/3;

    String message = "Rata-rata nilai: " + grade + (grade >= 60 ? " Congratulations, you passed :-)" : " Im sorry, you not passed :-(");
    JOptionPane.showMessageDialog(null, message);
    }
}
