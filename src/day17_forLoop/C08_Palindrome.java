package day17_forLoop;

public class C08_Palindrome {

    public static void main(String[] args) {


        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.

        //palindrome=kelimeyi yada neyi istersen tersine cevirince esit oluyorsa palindrome olur

       //madam ters cevirince yine madam olur gibi


        String input= "Madam";
        String terstenInput=tersineCevir(input);
        System.out.println("Girdiginiz kelimenin tersten yazilisi : " + terstenInput);
        if (input.equalsIgnoreCase(terstenInput)){
            System.out.println("Girdiginiz kelime palindrome");
        } else {
            System.out.println("girdiginiz kelime palindrome degil");
        } }
    private static String tersineCevir(String input) {
        String terstenInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            terstenInput+=input.charAt(i);
        }
        return terstenInput;
    }
}








