package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {

        int arr[][] = {{3, 1, 7}, {6, 10, 2}};

        System.out.println(arr[0][2]); //7
        System.out.println(arr[1][1]); //10

        //ilk inner array`in tum elementleri yazdirin

        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr[0]));
    }
}