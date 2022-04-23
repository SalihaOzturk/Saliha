package day12_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //  - Girilen kelime cumlede kullanilmamis.
        //   - Girilen kelime cumlede 1 kere kullanilmis.
         //  - Girilen kelime cumlede 1’den fazla kullanilmis.



        String cumle="Java ogren,yeni program ile yeni bir sayfa ac";
        String kelime="yeni";
        //Scanner scan;;;in yerine kullanilir


        int ilkKullanim=cumle.indexOf(kelime);   //-1  veya index   //4 ilk kelime
        int ikinciKullanim=cumle.indexOf(kelime,ilkKullanim+1); //15

        if(ilkKullanim==-1){   //-1 cumlede yok demekti
            System.out.println("girilen kelime cumlede kullanilmamis.");

        }else if(ikinciKullanim==(-1)){  //-1 ikinci kullanim yok
            System.out.println("girilen kelime cumlede bir kere kullanilmis");

        }else{
            System.out.println("girilen kelime cumlede 1'den fazla kullanilmis");
        }







    }
}
