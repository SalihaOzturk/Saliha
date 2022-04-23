package day13_stringManupulation;

public class C01_substring {

    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5));  //ile IT cok guzel

        //yukardaki stringi kullanarak Mehmet hoca ile IT cok guzel yazalim

        System.out.println(str.replaceAll("Java", "Mehmet hoca"));
        System.out.println("Mehmet hoca " +str.substring(5));

        System.out.println(str.substring(9));   //yazilan index inclusive(dahil demek)

        //eger bir indexten sona kadar olan parcayi degil,
        //belirli bir parcayi almak istersek
        //iki parametre yazmak gerekir,str.substring(baslangicIndexi,bitisIndexi)
        //baslangic indexi==>inclusive/dahil
        //bitis indexi===>exclusive/haric

        System.out.println(str.substring(0,5));     //java
        System.out.println(str.substring(0,1));     //j


        //bana 5.harfi string olarak bulun
        //String harf=str.charAt(6);    //kabul etmiyor

        String harf=str.substring(5,6);  //bana 6.harfi String olarak bulun
        System.out.println(harf);

        str="java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7));  //7.index dahil ilki,  son7 7.index haric. // hiclik("") cikar sonuc

        System.out.println(str.substring(5,2));//5. index ten sonra 2 diye bir index yok
        //bitis indexi baslangis index inden hucuk olamaz

        System.out.println(str.substring(str.length()-1));
        //length-1 son harfi veir

        //son 5 harfi yazdiralim
        System.out.println(str.substring(str.length()-5));  //siyor

        System.out.println(str.substring(str.length()));
        //son harften sonraki kismi yani hiclik verir



    }
}
