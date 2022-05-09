package esraCALISMA;

import java.util.Arrays;

public class TerstenSiralaDondur {

    public static void main(String[] args) {

        //verilen bir array i buyukten kucuge siralyip bize donduren method olusturun

        int arr1 []= {6,8,88,18,28,38,0,1,7};

        arr1= tersYazdir(arr1);
        System.out.println(Arrays.toString(arr1));



    }

    private static int[] tersYazdir(int[] arr1) {
        Arrays.sort(arr1);
        int arr2[] = new int[arr1.length];

        for (int i = 0; i < arr2.length; i++) {

          arr2[i] = arr1[arr1.length-1-i];
        }
        return arr2;
    }
}
