package day15_methodCreation;

import java.util.Scanner;

public class C07_MethodCreation {

    public static void main(String[] args) {

        //String str="Ali";

        //string'i yazdiran method olusturalim
       // stringYazdir(str);             ==>en son silinecek bu


        //String i yazdiran method olusturalim
        //hosgeldiniz diyen bir method olusturun
        //kapanma msj i yazan bir method olustur

        hosgeldinYazdir();
        stringYazdir("java gun gectikce guzellesiyor");
        kapanmaMethodu();


        hosgeldinYazdir();
    }
    // kapanma mesaji yazn bir method olustur
   //kapanmaMethodu();                  ===>en son silinecek bu
    private static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }

    // hosgeldiniz diyen bir method olusturun
    private static void hosgeldinYazdir() {
        System.out.println("Hosgeldin");
        stringYazdir("Boyle de olur");
    }
    //string'i yazdiran method olusturalim
     //stringYazdir(str);                ====>en son silinecek bu
    private static void stringYazdir(String str) {
        System.out.println(str);

    }
}

