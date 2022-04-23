package kendi_calismam;

public class VarargsC02 {
    public static void main(String[] args) {
        // parametre olarak bir int
        // ve istedigimiz kadar String alan
        // en uzun kelimenin harf sayisi ile int parametre degerini
        // carpip sonucu yazdiran bir method olusturun


        int sayi = 15;
        String str1 = "Fatma";
        String str2 = "Ayse";
        String str3 = "guzel";


        carpimSonuc(sayi, str1, str2, str3);

    }

    private static void carpimSonuc(int sayi, String... str) {
        String enUzunStr = "";

        for (String each : str) {

            if (each.length() > enUzunStr.length()) {
                enUzunStr = each;
            }
        }

        System.out.println("istenen deger : "+sayi*enUzunStr.length());
    }
}