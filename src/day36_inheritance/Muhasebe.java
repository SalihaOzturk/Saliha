package day36_inheritance;

import day35_inheritance.Personel;

public class Muhasebe  extends Personel {

    protected int saatUcreti;
    protected String statu;
    protected int maas;


        protected int maasHesapla(){
            int maas = saatUcreti*8*30;
            return maas;
        }






}
