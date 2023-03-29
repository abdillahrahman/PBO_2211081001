package abdi150323;

import javax.swing.JOptionPane;

public class latihan6522 {
    public static void main(String[] args){
        int angka;
        String output, input;

        input = JOptionPane.showInputDialog("Masukan angka : ");
        angka = Integer.parseInt(input);

        switch (angka) {
            case 1:
                output = "satu";
                break;
            case 2:
                output = "dua";
                break;
            case 3:
                output = "tiga";
                break;
            case 4:
                output = "empat";
                break;
            case 5:
                output = "lima";
                break;
            case 6:
                output = "enam";
                break;
            case 7:
                output = "tujuh";
                break;
            case 8:
                output = "delapan";
                break;
            case 9:
                output = "sembilan";
                break;
            case 10:
                output = "sepuluh";
                break; 
            default:
                output = "invalid number";
                break;
            }

        JOptionPane.showMessageDialog(null, output);
        
    }
}
