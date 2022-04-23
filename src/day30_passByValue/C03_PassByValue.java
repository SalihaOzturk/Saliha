package day30_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {
        /*
        java pass by value bir programlama dilidir
        yani,bir  primitive varible'i argument olarak bir method a yollarsaniz
        java o variable i degil,degerini (value) method a aktarir(pass)
         */

        double etiketFiyati=100;
        yudeOnIndirimYap(etiketFiyati);
        yudeOnIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra main method da etiket fiyati :"+etiketFiyati);


    }

    public static void yudeOnIndirimYap(double etiketFiyati) {
        etiketFiyati=etiketFiyati* 0.90;
        System.out.println("sizin icin %10 indirimli fiyatimiz : "+etiketFiyati);
    }
}
