package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        //soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        char ilkHarf= scan.next().charAt(0);

        //charAt(index) method'u parametre olarak yazdigimiz indexteki char'i bize gosterir.
        //string de index o'dan baslar
        //E R S I N
        //0 1 2 3 4
        //ilk basharf E ve 0 degeri bu yuzden charAt(0)

        System.out.println("Girdiginiz ismin ilk harfi : " + ilkHarf);





    }
}
