package day21_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        int arr[]; // deger atamasi yapmadik ama java kabuk etti

        arr=new int[6];
        System.out.println(Arrays.toString(arr)); //[0 0 0 0 0 0]
        System.out.println(arr.length); //6
                                        // String deki length(), burada yok

        //array`deki her bir elementi index degeri kadar artiralim

        for (int i = 0; i < arr.length; i++) {
            arr[i] +=i;

        }
        System.out.println(Arrays.toString(arr));

        // son index`deki elementi yazdiralim
        System.out.println(arr[arr.length - 1]);
    }
}
