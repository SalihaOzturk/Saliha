package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        //ternary ile yapilan tum islemler if else ile de yapilabilir
        //if else yerine ternary tercih etme sebebi yapinin basit ve anlasalibilr olmasidir
        //ternary icersinde sonuc veya bizi sonuca goturen basit islemler olabilir


        //kullanicidan bir tamsayi alip tek mi cift mi yazdiran bir kod yazalim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if(sayi%2==0){
            System.out.println("sayi cift");
        }else{
            System.out.println("sayi tek");
        }
        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");




    }







}
