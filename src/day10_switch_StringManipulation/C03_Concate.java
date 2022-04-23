package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

        //Concatenation yapmak icin iki ihtimalimiz var
        //istersek daha once yaptigimiz gibi + operatorunu kullanabiliriz
        //veya string class'indan gelen concat method unu kullanabiliriz


        String str1="Java";
        String str2="Candir";


        //java Candir yazdiralim
        System.out.println(str1+" "+ str2);


        String cumle=str1.concat(str2);  //javaCandir
        cumle= str1.concat(" ").concat(str2);

        System.out.println(cumle);


        //concat icine String degilde sayi veya boolean deger yazsak olur mu?
        //concat method u icine string parametre ister
        //string disinda bir data turu yazdiginizda onu string haline getirmelisiniz

       // cumle=str1.concat(""+5); olmaz
        //cumle=str1.concat(true+"");olmaz















    }







}
