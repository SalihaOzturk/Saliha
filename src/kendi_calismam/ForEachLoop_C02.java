package kendi_calismam;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop_C02 {


    public static void main(String[] args) {


        //10 elementli bir list olusturralim
        int arr[] = {2,5,4,6,4,9,7,1,3,10};

                List<Integer> sayilar= new ArrayList<>();

                for(int each:arr){
                    sayilar.add(each);
                }

        System.out.println(sayilar);

                //sayilar listesinde 3 e bolunemeyen sayilari for-each loop ile yazdiralim

        for(int each:sayilar){

            if(each%3!=0){
                System.out.print(each+" ");
            }
        }

    }

}
