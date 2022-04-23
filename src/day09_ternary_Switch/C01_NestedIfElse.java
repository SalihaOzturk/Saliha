package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
        //Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
        //bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
        //çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        // Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

        // 4 basamakil olup olmadigini kontrol et
        //1-dort basamakli kontrol et
        //2-5 e bolunuyor mu(0 a veya 5 e)
        //3-bes e bolunemiyor

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir sayi  giriniz");
        int sayi = scan.nextInt();


        if (sayi < 1000 || sayi > 9999) {   //istenmeyen durumu yaziyoruz
            System.out.println("lutfen 4 basamakli bir sayi giriniz");
        }

        //if(4 basamakli degilse){


        else if (sayi % 5 == 0) {  //4 basamakli ve sayi 5 e tam bolunur
            if (sayi % 10 == 0) {   //4 basamakli,5 ile bolunebilen ve son rakami o olan

                System.out.println("5 e bolunebilencift sayi");
            } else {   //4 basamakli sayi 5 e bolunebilen ve son rakami 0 olmayan

                System.out.println("5 e bolunebilen tek sayi");
            }


        }else{//4 basamakli ve 5 e bolunemiyor
            System.out.println("tekrar deneyin");}
    }

}
