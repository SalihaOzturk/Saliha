package day02_variables;

public class C02_Variables {
    public static void main(String[] args) {
        //java calismaya main method dan baslar
        //sonra yukaridan asagi,soldan saga dogru calisir

        //eger istersek bir variable'i once declare edip sonra deger atayabiliriz

        String okulIsmi;
        //java da deger atamasi yapmadigimiz bir variable olusturmamiza itiraz etmez
        //ancak deger atamasi yapincaya kadar o variable'i kullanmamiza izin vermez

        okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi); //Yildiz Koleji

        okulIsmi="Star Koleji";
        System.out.println(okulIsmi);

        okulIsmi="Java Koleji";
        System.out.println(okulIsmi); //Star Koleji

        okulIsmi="Java Koleji";

        //println ile print arasindaki fark
        //println dedigimizde yazdirma isleminden sonra alt satira gecerken
        //sadece print dedigimizde yazdirma isleminden sonra alt satira gecmez

        System.out.println(okulIsmi);  //Java Koleji
        System.out.println(okulIsmi);





    }





}
