package day04_dataCasting_Increment;

public class C02_AutoWidening {
    public static void main(String[] args) {

        boolean dogruMu=true;
        //String str="dogruMu"; sol string sag boolean olunca kabul etmiyor

;
        byte sayi1 = 44;
        System.out.println(sayi1);

        short sayi2 = sayi1;  //esitligin solu short,sagi ise byte olmasina ragmen java itiraz etmiyor
        //(byte i short a atiyoruz.byte kucuk oldugu icin short kolaylikla icine aliyor.
        //variable=short  value(deger)=byte   byte short a atiyoruz.)
        //deger olarak atanan data turu variable data turunden kucuk oldugu icin java sorun yapmaz.
        // AUTO WIDENING


        System.out.println(sayi2); //44


        double sayi3 = sayi2;
        System.out.println(sayi3); //44.0


    }
}
