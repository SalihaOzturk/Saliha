package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {


        LocalTime tm= LocalTime.now();
        System.out.println(tm);  //20.09.54.369815800


        //bir islemin ne kadar surede bittigini bulmak istersek
        //islemden once ve sonra birer time objesi olusturup
        //aradaki farki hesaplayabiliriz

        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=1;

        }

        LocalTime tmLoopSonrasi= LocalTime.now();
        System.out.println(tmLoopSonrasi);  //20:14:44.83.035.7300

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        System.out.println("islem "+(nano2-nano1)+ "nanosaniyede bitti");


        //ileriye veya geriye gidebiliriz
        System.out.println(tm.plusMinutes(1000));  // 13:00:01.132928

        //istersek zone id kullanarak  istedigimiz bolgenin saati icin de obje olusturabiliriz
        





    }
}
