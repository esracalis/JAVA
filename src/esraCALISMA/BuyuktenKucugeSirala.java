package esraCALISMA;

import java.util.Arrays;

public class BuyuktenKucugeSirala {

    public static void main(String[] args) {

        int arr[]= {5,88,7,90,12,0,2,18};
        tersYazdir(arr);
    }

    private static void tersYazdir(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int arr2[]= new int[arr.length];

        for (int i = 0; i <arr.length; i++) {
          arr2[i]= arr[arr.length-1-i];

        }System.out.println(Arrays.toString(arr2));

    }
}
