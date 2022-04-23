package kendi_calismam;

import java.util.ArrayList;
import java.util.List;

import static day25_lists.C03_ListdenIstenmeyenElementleriSilme.istenmeyenElementiSilveYazdir;

public class ListdenIstenmeyenElemanlariSilme_C03 {

    public static void main(String[] args) {


        int arr[]={3,4,2,5,7,3,8,5,2,4};
        int istenmeyenEleman=2;


        istenmeyenElementiSilveYazdir1(arr,istenmeyenEleman);





    }

    private static void istenmeyenElementiSilveYazdir1(int[] arr, int istenmeyenEleman) {

        List<Integer> yeniList = new ArrayList<>();


        for(int i=0;i<arr.length;i++){

            if(arr [i]!=istenmeyenEleman){

                yeniList.add(arr[i]);
            }
        }

        System.out.println(yeniList);

    }


}
