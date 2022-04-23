package day30_passByValue;

public class C01_StaticBlocks {
    static{
            //static block yapmak icin sadece static yazip suslu parantez aciyoruz
             //class calismaya baslamadan yapmamiz gereken on atamalar varsa onlari yapar
             //class ilk calismaya basladiginda devreye girer
             //yazildigi satirin hicbir onemi yoktur
             //class icersinde istenen yere yazilabilir
            //static blok birden fazla olursa bloklar yukaridan asagi dogru calisir

        System.out.println("static block calisti");
    }
    C01_StaticBlocks(){
        System.out.println("constructor calisti");
    }


    public static void main(String[] args) {
        System.out.println("main method baslangici");

        C01_StaticBlocks obj1;
        new C01_StaticBlocks();
        System.out.println("main method sonu");

    }
}
