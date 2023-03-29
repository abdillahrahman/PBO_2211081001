package abdi160323;
import java.util.*;

public class HariDoWhile {
    public static void main (String [] args){
        String days [] = {"Senin","Selasa","Rabu","Kamis","Kamis","Jum'at","Sabtu","Minggu"};
        int i=0;
        do {
            System.out.println(days[i]);
            i++;
        }while(i<days.length);
    }
}
