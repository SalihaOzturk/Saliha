package day05_matematikselIslemler;

public class C04_WrapperClass<so, sou> {
    public static void main(String[] args) {


        //primitive data turu ile non-primitive arasindaki farklar nelerdir?


        String str = "java";
        int sayi = 10;

        System.out.println(str.toUpperCase());   //java
        System.out.println(str);


        //non-primitive data turleri data depolamak yaninda bircok faydali methoda sahiptir
        //ancak primitive data turlerinin boyle bir ozelligi yoktur.
        //primitive data turleri sadece degerleri saklar(container)


        //primitive data turleri icinde bazi methodlar gerekli oldugunda
        //java ara bir cozum uretmistir
        //java her bir primitive data turunu,non- primitive olarak kullanabilmek icin
        //ozel class lar olusturmus ve bunlara wrapper class adini vermistir

        double sayi2 = 20.5;

        //sayi2 primitive oldugundan sayi 2. dedigimizde hic bir method gelmez

        Double sayi3 = 15.2;

        //sayi3 wrapper Class olan Double classini kullandigindan
        //sayi3. dedigimizde bircok method gelir


    }





}
