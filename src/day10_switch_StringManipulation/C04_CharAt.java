package day10_switch_StringManipulation;

public class C04_CharAt {
    public static void main(String[] args) {




    //String de hrehangi bir karakteri almak istedigimizde o harfin indexini kullanarak
    //o harfin index ini kullanarak str.charAt(istenenIndex) yazabiliriz

    String str="Java Cok Guzel";
    //j yi yazdiralim

    System.out.println(str.charAt(0));

    //G yi yazdiralim
        System.out.println(str.charAt(9));
        //boslukta bir index tir,bu yuzden onu da sayar

        //va yazdiralim
        System.out.println(""+str.charAt(2)+str.charAt(3));  //va
        //215
        //char lari  matematiksel isleme sokarsak asci degerleri devreye girer.
        //ILK harten once ("") yada ilk harften sonra,yani hiclik koyarsaniz durum duzelir


        //cOK seklinde yazdiralim
        System.out.println(str.toLowerCase().charAt(5)+
                ""+str.toUpperCase().charAt(6)+
                str.toUpperCase().charAt(7));

        //son karakteri yazdir
        //yukaridaki String de 14 harf var (java cok guzel),son harfin indexi 14-1
        System.out.println(str.charAt(14-1)); //uzunluk -1
        //l


        //index o'dan basliyor
        //eger uzunlugu index olarak girersek

        System.out.println(str.charAt(14));
        //java calistiktan sonra hata verir


}
}