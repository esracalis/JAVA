package esraCALISMA;

import java.util.Arrays;

public class Short {

    public static void main(String[] args) {

        int arr[]= {3,6,8,1,23,9,88,11};

        int enKucukSayi= Integer.MAX_VALUE;
        int enBuyukSayi= Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<enKucukSayi){
                enKucukSayi=arr[i];
            }if(arr[i]>enBuyukSayi){
                enBuyukSayi=arr[i];
            }

        }
        System.out.println(enKucukSayi);
        System.out.println(enBuyukSayi);

        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);


    }
}
