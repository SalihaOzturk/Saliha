package day04_dataCasting_Increment;

public class C06_WrapperClass {
    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";

        //verilen 2 stringdeki sayilari toplayin

        System.out.println(str1 + str2);
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2) );//35801

        //integer.valueof(str) methodu sadece deger iceren Strimglerde kullanilabilir
        //bir tane bile sayi disinda karakter olursa java hata verir





    }
}
