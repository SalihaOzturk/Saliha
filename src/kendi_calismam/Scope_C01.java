package kendi_calismam;

public class Scope_C01 {

    int sayi;
    String okulIsmi;
    boolean okulAcikMi;


    public static void main(String[] args) {


        Scope_C01 obj1 = new Scope_C01();
        System.out.println(obj1.okulAcikMi);
        obj1.okulIsmi="yk";
        System.out.println(obj1.okulIsmi);

    }
}
