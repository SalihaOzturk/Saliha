package day05_matematikselIslemler;

public class C05_WrapperClass {

    public static void main(String[] args) {


        short sayi1=20;
        Short sayi2=30;

        sayi1=sayi2;
        //wrapper class ile ayni isimdeki primitive data turu arasinda gecis yapilabilr

        System.out.println(sayi1);
        //30

        System.out.println(Short.MAX_VALUE);   //32767
        System.out.println(Short.MIN_VALUE);   //-32768

        System.out.println(Short.BYTES);  //2 byte=16 bit











    }




}
