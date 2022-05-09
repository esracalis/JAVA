package day05_matematikselislemler;

public class C02_PireIncrementPostIncrement {

    public static void main(String[] args) {
        int a=15;
        int b=++a;
        System.out.println(b);

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2= sayi1++;

        System.out.println(sayi1 + "," + sayi2  + "," + sayi3);

        sayi3= ++sayi1;
        System.out.println(sayi1 + "," + sayi2  + "," + sayi3);

        System.out.println(sayi3++); //12

        System.out.println(--sayi2); //9
    }
}
