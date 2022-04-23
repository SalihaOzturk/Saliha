public class C02_PreincrementPostincrement {
    public static void main(String[] args) {

        int sayi=10;
        System.out.println(sayi);

        sayi++;
        System.out.println(sayi);

        sayi++;
        System.out.println(sayi);

        System.out.println(sayi);
        sayi++;


        System.out.println(++sayi);
        System.out.println("pre_increment satirinda " + ++sayi);
        System.out.println("pre-increment once " +sayi);



        System.out.println("pre_increment satirinda " + ++sayi);
        System.out.println("pre-increment sonra " +sayi);

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2= sayi1++;
        System.out.println(sayi1 +"," + sayi2 + "," + sayi3);

        sayi3=++sayi1;

        System.out.println(sayi1 + "," + sayi2 + "," + sayi3);

        System.out.println(sayi3++);  //once yazdiracak sonra arttiracak
                                        //once 12 yazdiracak, sonra sayi3=13


        System.out.println(--sayi2);  //once azalt sonra yazdir
                                        //once sayi2=9 sonra sayi2 nin son degeri yani 9 yazdirir







    }
}
