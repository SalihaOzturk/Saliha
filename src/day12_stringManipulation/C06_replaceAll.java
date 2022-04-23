package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        //kullanicidan isim-soyisim bilgisini alip
        //butun harfleri * yapalim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi yaziniz");
        String soyisim= scanner.nextLine();

        System.out.println(soyisim.replaceAll("\\S","*"));





    }
}
