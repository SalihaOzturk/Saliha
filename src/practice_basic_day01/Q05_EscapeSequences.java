package practice_basic_day01;

public class Q05_EscapeSequences {
    public static void main(String[] args) {

         /*
 \n (or \r): starts from a new line : metni bir alt satirdan itibaren yazdirir.
         \t:  horizontal tab : metni yatayda 1 tab miktari kaydirir.
         \\: prints a back slash :\ (ters slash) yazdirir
         \': prints single quote :' tek tirnak yazdirir.
         \": prints double quote :"" cift tirnak yazdirir.

            \: backslash
            /:front slash

            */

        //soru-1 konsola  "Hello " ;  "World    \  //"   seklinde yazdiriniz
        System.out.println("    \"Hello \", \"World   \\  //\"");

        //soru-2:Pazartesi kelimesinin her harfini ayri bir satira gelecek sekilde yazdiriniz
        System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");

      //Soru-3 :"Java" ile hayat cok 'afilli' yazdiriniz
        System.out.println("\"Java\" ile hayat cok \'afilli\'");


        //Soru-4:"Zaruret insani kasif yapar yazdiriniz
        //Sonraki "TechProed ile java cok kolay..." ifadesi 3 satir ve satir basindan 1 tab ileride yazilsin

       // System.out.println("\"Zaruret\" insani\n\'kasif\'yapar\n\n\n\t\"TechProed ile java cok kolay...);



    }
}
