package kendi_calismam;

public class NestedForLoopC05 {

    public static void main(String[] args) {



     /*  A
          A B
          A B C
          A B C D
          A B C D E
          A B C D E F
           seklinde yazdiriniz. 65=A'nin ascii degeri

          */

        char input = 'K';

        for (char i = 'A'; i <= input; i++) {
            for (char j = 'A'; j <=i; j++) {

                System.out.print(j + " ");
            }
                System.out.println("");


            }
        }
    }

