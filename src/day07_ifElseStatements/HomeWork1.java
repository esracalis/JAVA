package day07_ifElseStatements;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
        //olmadigini yazdirin
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter = scan.next().charAt(0);

        if (karakter >= 'A' && karakter <= 'Z' || karakter >= 'a'
                && karakter <= 'z') {

            System.out.println("girdiginiz karakter harftir");
        } else {
            System.out.println("Girdiginiz karakter harf degildir");

*/

        //Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve
        // dikdortgenin kare olup olmadigini yazdirin

       /* Scanner scan=new Scanner(System.in);
        System.out.println("Dikdortgenin kenar uzunluklarini yaziniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();

        if(kenar1==kenar2){
            System.out.println("girdiginiz degerler karedir");
        }else{
            System.out.println("girdiginiz degerler kare degildir");
        }

*/
        //Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        //“Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        /*Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun seciniz");
        String gunAdi= scan.next().toLowerCase();

       if (gunAdi.equals("cuma")) {
           System.out.println("Muslumanlar icin kutsal gun");
       }
        if (gunAdi.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (gunAdi.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        }

*/

        //Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar
        // uzunlugu birbirine esit ise ekrana “Eskenar ucgen” yazdirin.
        // Diger durumlarda ekrana “Eskenar degil” yazdirin

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunlugunu yaziniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();


        if ((kenar1 == kenar2) && (kenar2 == kenar3)) {
            System.out.println("eskenar ucgen");
        } else {
            System.out.println("eskenar degil");
        }

         */
        //Soru 5) Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun isminin
        //1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin,
        //gun ismi gecerli degilse “Gecerli gun ismi giriniz” yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi = scan.next().toLowerCase();

        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") || gunIsmi.equals("cuma") ||
                gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")) {

            System.out.println(gunIsmi.toLowerCase().charAt(0) +""+ gunIsmi.charAt(1) +""+ gunIsmi.charAt(2));
        } else {
            System.out.println("Gecerli gun ismi giriniz");

        }
    }
}