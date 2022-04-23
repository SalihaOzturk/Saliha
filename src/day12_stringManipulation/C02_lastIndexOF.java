package day12_stringManipulation;

public class C02_lastIndexOF {
    public static void main(String[] args) {


        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //      - Girilen kelime cumlede kullanilmamis.
        //      - Girilen kelime cumlede 1 kere kullanilmis.
        //      - Girilen kelime cumlede 1’den fazla kullanilmis.



        String cumle="Java ogren,yeni program ile yeni bir sayfa ac";
        String kelime="yeni";
        //Scanner scan;;;in yerine kullanilir


        int ilkKullanim=cumle.indexOf(kelime);   //-1  veya index   //4 ilk kelime
        // index(of)aramaya bastan basliyor
        int sonKullanim=cumle.indexOf(kelime);
        //lastindex(of)aramaya sondan basliyor

        if(ilkKullanim==-1){
            System.out.println("girilen kelime cumlede kullanilmamis");

        }else if(ilkKullanim==sonKullanim){
            System.out.println("girilen kelime 1 kere kullanilmis");
        }else{
            System.out.println("girilen kelime cumlede 1'den fazla kullanilmis");
        }

        String str="Eclipse";
        System.out.println(str.lastIndexOf("p",4));  //4 dahil

    }





}
