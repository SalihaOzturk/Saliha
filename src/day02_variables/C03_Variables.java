package day02_variables;

public class C03_Variables {
    public static void main(String[] args) {

        String ogrenciIsmi="Melih";

        ogrenciIsmi="Furkan";

        //bir variable declare edildikten sonra istedigimiz kadar deger degisimi yapabiliriz
        //ancak declare edilen bir variable tekrar declare edilmez

       // String ogrenciIsmi="Abdullah";

        String isim, soyisim, dogumYeri;
        isim="Nihad";
        soyisim="ozel";
        dogumYeri="Ankara";

        System.out.println(dogumYeri);

        System.out.println(soyisim);

        System.out.println(isim + " " + soyisim + " " + dogumYeri);


        String tcNo="12345678901";
        String hiclik="";

        //String non-primitive oldugu icin biz sadece data saklamak degil
        //ekstra bazi ozellikleri de kullanabiliyoruz
        //eger tc no,okul numarasi veya tel numarasi gibi
        //kendisi sayisal olan ancak matematiksel bir islem kullanilmayan
        //degerler icin de String kullanilir


        String harf="A";
        char harf2='A';

        //bu ikisi icinde ayni durum gecerli
        //ben A harfi icin bir variable i char olarak da olusturabilirim,
        //String olarakda olusturabilirim
        //eger sadece saklayacaksak char kullanilabilir ama
        //String in ozellliklerinden istifade etmek icin String olarak tanimlamak daha avantajli










    }






}
