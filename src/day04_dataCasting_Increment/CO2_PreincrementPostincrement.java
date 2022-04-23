package day04_dataCasting_Increment;

public class CO2_PreincrementPostincrement {
    public static void main(String[] args) {
        
         int sayi1=10;
         int sayi2=20;
         int sayi3=30;

         sayi2=sayi1++;

        System.out.println(sayi1 + ", " + sayi2 + ", " +sayi3);
        //11,1o.30


        sayi3=++sayi1;
        //atama sonra, sayi3=sayi1(12)
        // arttirma once sayi1=12

        System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3);
            //sayi1=12 sayi2=10 sayi3=12


        System.out.println(--sayi2);
        //9
        //once azalt sonra yazdir
        //once sayi2=9 sonra sayi 2 nin don degeri yani 9 yazdirir


    }
}
