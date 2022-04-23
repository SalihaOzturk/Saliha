package kendi_calismam;


import java.util.Arrays;

public class Sort_C02 {

    // verilen bir array'de en kucuk ve en buyuk degerleri yazdirin

    public static void main(String[] args) {

        int arr[]={3,5,8,9,25,64,};
    terstenSiralaYazdir(arr);


    }

    private static void terstenSiralaYazdir(int[] arr) {

        Arrays.sort(arr);
        int tersArr[] = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            tersArr[i] =arr[arr.length-1];


        }
        System.out.println(Arrays.toString(tersArr));

    }    }