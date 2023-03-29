package abdi150323;

import java.util.Scanner;

public class pangkat_forloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();
        System.out.print("Masukkan pangkat: ");
        int pangkat = scanner.nextInt();

        int hasil = 1;
        for (int i = 1; i <= pangkat; i++) {
            hasil *= angka;
        }

        System.out.println(angka + " pangkat " + pangkat + " adalah " + hasil);
    }
}
