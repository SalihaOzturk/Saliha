package day12_stringManipulation;

public class C03_contains {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
        //mehmet@gmail.com.tr


        String email="mulkiyeayboy@hotmail.com";
        String arananMetin="@gmail.com"; //10

        if(!email.contains(arananMetin)) {
            //boolean ifadeyi tersine cevirmek istiyorsan basina  !  koyar
            //neyi bulmuyorsa tersini alin
            //email gmail icer miyor mu diye soruyor unlem kullanilirsa basinda?
            //yukaridaki ifadeyi hotmail yerine gmail yapti


        }else if(email.lastIndexOf(arananMetin)==(email.length()-10)) {
            System.out.println("Email adresiniz kaydedildi");
            //yukaridaki ifadeyi hotmail yerine gmail yapti

        }else{
            System.out.println("Lutfen yazimi kontrol edin");


        }










    }
}
