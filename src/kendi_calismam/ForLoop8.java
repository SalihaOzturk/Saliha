package kendi_calismam;

public class ForLoop8 {

    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.

        //palindrome=kelimeyi yada neyi istersen tersine cevirince esit oluyorsa palindrome olur

        //madam ters cevirince yine madam olur gibi


        String input = "java";
        palindromeKontrolEt(input);
    }

    private static void palindromeKontrolEt(String input) {

        String terstenInput = "";

        for (int i = input.length() - 1; i <= 0; i--) {
            terstenInput += input.charAt(i);

        }
        System.out.println("girdiginiz kelimenin tersten yazilisi " + terstenInput);

    if(input.equalsIgnoreCase(terstenInput)){

        System.out.println("girdiginiz kelime polindrome");
    }else
            System.out.println("girdiginiz kelime polindrome degildir");


        }
    }
