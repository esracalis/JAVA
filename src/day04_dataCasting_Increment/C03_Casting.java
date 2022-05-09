package day04_dataCasting_Increment;

public class C03_Casting {
    public static void main(String[] args) {

        int sayi1=8;
        int sayi2=4;

        System.out.println(sayi1/sayi2);

        sayi2=3;
        System.out.println(sayi1/sayi2);

        sayi1=22;
        System.out.println(sayi1/sayi2);

        sayi1=478;
        sayi2=10;

        sayi1=sayi1/sayi2;
        System.out.println(sayi1);

        sayi1 =sayi1/sayi2;
        System.out.println(sayi1);

        sayi1 =sayi1/sayi2;
        System.out.println(sayi1);

        // sayi1=sayi1/sayi3; // iki farkli sayi data turunu isleme koydugumuzda
        // Java kucuk olan data turu icin autoWidening yapar
        // bu islemi dusunursek sayi1/sayi3 => islemin sonucunu double kabul eder



    }
}
