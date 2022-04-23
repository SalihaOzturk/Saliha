package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1=879;
        double sayi2=10;

        double sayi3=sayi1/sayi2;  //87.9
        System.out.println(sayi3);

        int sayi4=(int)(sayi1/sayi2);   //87.9

        //int sayi4=(int)(sayi1/sayi2); //87.9    //kabul etmiyor cunku bir taraf int diger taraf double
        //deger double,variable int
        //yani variable daha dar dolayisiyla java bunu otomatik olarak yapmaz
       // sorumlulugu ustlenmemizi ister
        //sag tarafa yazdirdigimiz (int) sorumluluk bende demek

        System.out.println(sayi4); //87


        //87.9
        //sag tarafa yazdirdigimiz (int) sorumluluk bende demek.
        System.out.println(sayi4);
        //87
        // veya soylede yapabiliriz; sayi bir zaten int,
        // sayi ikinin onune int yazip tekrar calistirabiliriz.



        int sayi5=140;
        //-116
        //integer -128 ve 127 arasinda olmak zorunda
       // byte sayi6=sayi5; kabul etmiyor cunku sag taraftaki integer/sol taraftaki variable byte.int>byte
        //sayi5 in onune byte yazarak sorumluluk bende demis oluyoruz
        byte sayi6=(byte)sayi5; //sag taraftaki deger int > sol taraftaki variable byte
        System.out.println(sayi6);
        //int -128 den buyuk olamaz dolayisiyla 140-127=13
        //127 den sonra basa sariyor yani -128 e gelmek zorunda
        //-128 i de 1 tane sayiyor 128-12=116


        sayi5=129;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);
        //-126

        sayi5=260;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);
        //4


        sayi5=520;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);
        //8

        sayi5=-130;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);
        //126


        sayi5=44;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);
        //44  kucuk deger oldugu icin oldugu gibi kabul eder











    }




}
