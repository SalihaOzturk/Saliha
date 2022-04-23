package kendi_calismam;

import java.util.Scanner;

public class MDArrays_C07 {

    public static void main(String[] args) {
        //kullanicidan bir cumle isteyin ve cumledeki kelime sayisini giriniz


        Scanner scan = new Scanner(System.in);
        System.out.println("cumle giriniz");
        String cumle= scan.nextLine();


        String arr[]=cumle.split(" ");
        System.out.println("girdiginiz cumledeki kelime syaisi : " +arr.length);




    }




}
