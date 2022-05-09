package day21_Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[]={"Ali","Veli","Esra"};

        // array icindeki elementlere ulasmak icin index kullanir

        System.out.println(arr1[0]);

        arr1[1] = "Ahmet";
        System.out.println(arr1[1]);

        //array`in icindeki indexi kullanarak elementlere ulasilabilir ve update edilebilir

        int arr2[]=new int[4];

        System.out.println(arr1[1]);
        System.out.println(arr1[3]);
       // System.out.println(arr1[5]);  // ArrayIndexOutOfBoundsException

        //array`in tamamini yazdirmak istersek
        System.out.println(arr2);

        for (int i = 0; i <4; i++) {
            System.out.println(arr2[i]);

        }

    }
}
