package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //scanner kullanmak icin 3 adim takip ediyoruz
        //1. adim kendimize bir scanner olusturmak

        Scanner scan = new Scanner(System.in);
        //esitligin saginda yeni bir scanner olustutulur
        //ve olusturulan bu scanner scan variable'na assign edilir
        //scan variable in ismidir,istedigimiz ismi verebiliriz

        //2.adim :kullanicidan istedigimiz degeri girmesi icin aciklayici bir bilgi yazdirin
        System.out.println("Lutfen isminiz giriniz");

        //3.adim :kullanicinin girdigi degeri uygun bir variable olusturup kaydedin

        //String kullaniciIsmi=scan.next();
        //sadece ilk kelimeyi alir(ilk space e kadar olan bolumu alir)



        String kullaniciIsmi=scan.nextLine();
        //satir sonuna kadar girilen tum degerleri alir
        System.out.println("Kullanicinin girdigi isim : " + kullaniciIsmi);












    }
}
