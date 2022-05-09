package day07_ifElseStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C08_Esra_IfElse {
    public static void main(String[] args) {

        /*int sayi1 = 55;
        int sayi2 = 90;

        if (sayi1 > sayi2) {
            System.out.println("sayi1 sayi2 den buyuktur");
        } else if (sayi1 < sayi2) {
            System.out.println("sayi1 kucuktur sayi2 den");
        } else {
            System.out.println("sayi1 esittir sayi2 ye");
        }
    }
    */
        //Kontrol edilecek yıl
        /*int yil = 2017;
        if ((yil % 400 == 0) || ((yil % 4 == 0) && (yil % 100 != 0))) {

            System.out.println("  yili artik bir yildir");
        } else
            System.out.println("yili artik yil degildir");

    }
    */

        /*Scanner scan = new Scanner(System.in);

        System.out.println("Sinav notunu giriniz");
        int not= scan.nextInt();

        if (not > 50) {
            System.out.println("Sinavdan gectiniz");
        } else {
            System.out.println("Sinavdan kaldiniz");

        }
*/

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Sinav notunu giriniz");
        int not = scan.nextInt();

        if (not > 90) {
            System.out.println("AA ile gectiniz");
        } else if (not > 85) {
            System.out.println("BA ile gectiniz");
        } else if (not > 80) {
            System.out.println("BB ile gectiniz");
        } else if (not > 75) {
            System.out.println("CB ile gectiniz");
        } else if (not > 50) {
            System.out.println("Kosullu gectiniz");
        } else {
            System.out.println("Dersten kaldiniz");
        }*/

        Scanner scan= new Scanner(System.in);
        int sayi1, sayi2;
        System.out.println("Birinci sayiyi giriniz");
        sayi1=scan.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        sayi2= scan.nextInt();

        System.out.println("1.Toplama");
        System.out.println("2.Çıkarma");
        System.out.println("3.Bölme");
        System.out.println("4.Çarpma");

        System.out.print("İslemi seçiniz: ");
        int islem= scan.nextInt();
        if(islem==1){
            System.out.println(sayi1+sayi2);
        }
        else if(islem==2){
            System.out.println(sayi1-sayi2);
        }
        else if(islem== 3){
            System.out.println((float)sayi1/sayi2);
        }
        else if(islem == 4){
            System.out.println(sayi1*sayi2);
        }
        else{
            System.out.println("seciminiz dogru degil");
        }
    }
}