package kendi_calismam;

public class whileLoopC02 {


    public static void main(String[] args) {


        //kullanicidan bir sayi alin ve
        //bu sayinin rakamlari toplamini yazdirin


        int input=7645;
        int rakam=0;
        int rakamlarToplami=0;


        while(input>0){

            rakam=input%10;
            rakamlarToplami+=rakam;
            rakam/=10;

        }

        System.out.println("rakamalarToplami");















    }












}
