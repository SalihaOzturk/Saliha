package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarinYeriniDegistime {

    public static void main(String[] args) {
        //verilen bir listede, istenen iki index deki elementlerin yerini
        //kalici olarak degistiren bir method olusturun

        //bir listede ortalamanin ustunde olan element sayisini bulunuz

        List<Double> sayilar = new ArrayList<>();

        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);

        int ilkIndex=2;
        int ikinciIndex=5;

       sayilar=swapElements(sayilar,ilkIndex,ikinciIndex);





    }

    public static List<Double> swapElements(List<Double> sayilar, int ilkIndex, int ikinciIndex) {
        //bir tem sayi olusturup
        //verilen indexlerdeki sayialri yer degistirin
        //indexleri kontrol edip sinirin otesinde index verildiyse uyari msj i yazdirin



        return sayilar;
    }
}
