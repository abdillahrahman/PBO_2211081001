package abdi150323;

import javax.swing.JOptionPane;

public class latihan6521 {
    public static void main(String[] args){
        int angka;
        String output, input;

        input = JOptionPane.showInputDialog("Masukan angka : ");
        angka = Integer.parseInt(input);

        if (angka == 1) {
            output = "satu";
        } else if (angka == 2) {
            output = "dua";
        } else if (angka == 3) {
            output = "tiga";
        } else if (angka == 4) {
            output = "empat";
        } else if (angka == 5) {
            output = "lima";
        } else if (angka == 6) {
            output = "enam";
        } else if (angka == 7) {
            output = "tujuh";
        } else if (angka == 8) {
            output = "delapan";
        } else if (angka == 9) {
            output = "sembilan";
        } else if (angka == 10) {
            output = "sepuluh";
        } else {
            output = "Invalid number";
        }

        JOptionPane.showMessageDialog(null, output);
        
    }
}
