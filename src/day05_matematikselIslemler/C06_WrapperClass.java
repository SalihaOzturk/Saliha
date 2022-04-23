package day05_matematikselIslemler;

public class C06_WrapperClass {

    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";


        //verilen iki stringdeki sayilari toplayin

        System.out.println( str1 + str2 );  //1234523456

        System.out.println(Integer.valueOf(str1) +Integer.valueOf(str2) );   //35801


        //integer.valuleof(str1) methodu sadece sayisal deger iceren string lerde kullanilabilir
        //bir tane bile sayi disinda karakter olursa java hata verir









    }







}
