package day18_nestedForLoop;

import java.util.Scanner;

public class esraCalisma_Loop2 {
    public static void main(String[] args) {


        //Aşağıdaki şekli nested loop kullanarak oluşturun.
        //**********
        //*********
        //********
        //*******
        //******
        //*****
        //****
        //***
        //**
        //*

        /*for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();

        }
         */

        //Aşağıdaki şekli nested loop kullanarak oluşturun.
        //1*********
        //2********
        //3*******
        //4******
        //5*****
        //6****
        //7***
        //8**
        //9*
        //10

       /* for (int i = 1; i <=10; i++) {
            System.out.print(i);
            for (int j = 10; j >i; j--) {
                System.out.print("*");

            }
            System.out.println();

        }
        */

        // Bir sayının tam bölenlerini ve tam bölenlerinin toplamını bulun.

        /*int sayi = 72;
        int bolen = 1;
        int tamBolenlerToplami = 0;

        while (bolen <= sayi) {
            if (sayi % bolen == 0) {
                System.out.println(sayi + "sayisi " + bolen + "sayisina tam bolunur");
                tamBolenlerToplami = tamBolenlerToplami + bolen;
            }
            bolen++;
        }
        System.out.println(sayi + " sayisinin tam bolenlerinin toplami:" + tamBolenlerToplami);

         */

        //While döngüsünü kullanarak kullanıcının istediği kadar sayıyı toplayabildiği bir
        // uygulama yazın. java.util.Scanner sınıfını dahil etmeyi unutmayın!
        // (import java.util.Scanner;)

        Scanner kullanici = new Scanner(System.in);
        double toplam = 0;
        double girdi = -1;
        int adet = 1;
        System.out.print("Toplanacak Sayıları Girin (Çıkmak için 0 girin)\n\n");
        while (girdi != 0) {
            System.out.print(adet + ". Sayı: ");
            girdi = kullanici.nextDouble();
            toplam = toplam + girdi;
            adet++;
        }
        System.out.println("\n\nToplam: " + toplam);

    }
}