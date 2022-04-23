package kendi_calismam;

import java.util.Arrays;

public class BineraySearch_C06 {

    public static void main(String[] args) {


        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi=8;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,istenenSayi));

        //bineraySearch de olmayan sayi icin - eksi kullanir,ve o sayi nerde
        //olmasi gerekiyorsa ordaki uzunlukla saydirir,indexle degil



    }
}
