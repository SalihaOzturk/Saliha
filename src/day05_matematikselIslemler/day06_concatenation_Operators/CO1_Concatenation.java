package day05_matematikselIslemler.day06_concatenation_Operators;

public class CO1_Concatenation {

    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;

        //variable larin degerlerini degistirmeden
        //asagidaki ifadeleri,bu variablari kullanarak yazin

        System.out.println(str1+sayi1+str2);  //Java5Guzel

        //2Guzel15
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);


        //Java 22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));


        //53Guzel
        System.out.println(sayi1+sayi2+str1);  //8Guzel
        System.out.println(sayi1+sayi2+ str2); //53Guzel
        System.out.println(""+sayi1+sayi2+str2); //53Guzel


        /*eger tamamen sayilardan olusan bir string varsa ve biz bunu int'a cevirmek
        istersek integer.valueof(str)

        bir sayiyi Stringe cevirmek istersem
        ""+sayi   yapilir
         */




    }




}
