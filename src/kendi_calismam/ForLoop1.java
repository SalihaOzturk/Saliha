package kendi_calismam;

public class ForLoop1 {

    public static void main(String[] args) {

        for (int i = 10; i <= 30; i++) {
            System.out.print(i + ",");
        }


        int baslangic = 50;
        int bitis = 100;

        for (int i = baslangic; i <= bitis; i++) {

            if (i < bitis) {
                System.out.print(i + ",");

            } else {
                System.out.print(i);


            }
        }
    }
}