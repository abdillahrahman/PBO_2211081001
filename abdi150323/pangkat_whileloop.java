package abdi150323;

import java.util.Scanner;

public class pangkat_whileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();
        System.out.print("Masukkan pangkat: ");
        int pangkat = scanner.nextInt();

        int hasil = 1;
        int i = 1;
        while (i <= pangkat) {
            hasil *= angka;
            i++;
        }

        System.out.println(angka + " pangkat " + pangkat + " adalah " + hasil);
    }
}
