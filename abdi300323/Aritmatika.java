package abdi300323;

public class Aritmatika {
    public boolean cekGanjil(int a) {
        if (a % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
    

    public int[] getGanjil(int awal, int akhir) {
        int[] ganjil = new int[(akhir-awal)/2+1];
        int index = 0;
        for (int i = awal; i <= akhir; i++) {
            if (cekGanjil(i)) {
                ganjil[index] = i;
                index++;
            }
        }
        return ganjil;
    }

    public static void main(String[] args) {
        Aritmatika a = new Aritmatika();
        int[] ganjil = a.getGanjil(1, 10);
        System.out.println("Bilangan ganjil dalam rentang 1-10:");
        for (int i = 0; i < ganjil.length; i++) {
            System.out.print(ganjil[i] + " ");
        }
    }
}
