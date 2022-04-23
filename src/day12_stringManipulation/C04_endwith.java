package day12_stringManipulation;

public class C04_endwith {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
        //mehmet@gmail.com.tr


        String email = "mulkiyeayboy@gmail.com";
        String arananMetin = "@gmail.com"; //10

        if (!email.contains(arananMetin)) {
        System.out.println("Lutfen gmail adresinizi giriniz");
    }else if(email.endsWith(arananMetin)) {
            System.out.println("Email adresiniz kaydedildi");
        }else{
            System.out.println("Lutfen yazimi kontrol edin");
        }

    }
}
