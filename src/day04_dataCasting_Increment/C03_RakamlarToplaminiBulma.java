package day04_dataCasting_Increment;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        //kullanicidan aldiginiz 4 basamakli bir sayinin
        //basamaklardaki rakamlar toplamini bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("luyfen 4 basamakli bir tam sayi giriniz");
        int sayi=scan.nextInt();


        int rakam=0;
        int rakamlarToplami=0;

        //1. adim rakam=0 rtoplami=o sayi=7532

        rakam=sayi%10; //2               //burda son basamak olan 2'yi bulacak
        rakamlarToplami +=rakam; //2     //burda rakamlar toplami 2 olacak
        sayi/=10; //753                  //burda 7532 den 2'yi atacak=753

        //2.adim r=2 rt=2 sayi=753

        rakam=sayi%10;                    //burda son basamak olan 3'u bulacak
        rakamlarToplami +=rakam;  //5      //burda rakamlar toplamina 3 ekleyecek  2+3=5
        sayi /=10; //75                    //burda 753'den 3'u atacak=75


        // 3.adim r=3 rt=5 sayi=75

        rakam=sayi%10; //5;                 //son basamak olan 5'i bulacak
        rakamlarToplami +=rakam; //10        //rakamlar toplamina 5'i ekleyecek==>  2+3=5
        sayi /=10; //7                        //75'ten 5'i atacak ==>7


        rakam=sayi%10;                        //son basamak olan 7'yi bulacak
        rakamlarToplami +=rakam;              //rakamlar toplamina 7 ekleyecek==>2+3+5+7
        sayi/=10;                              //7'den kalani atacak==>0

        System.out.println("girdiginiz sayinin rakamlari toplami " + rakamlarToplami);









    }
}
