package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {
        // Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen adinizi girin");
        char ilkHarf= scan.next().charAt(0);

        // E s r a
        System.out.println("Girdiginiz ismin ilk harfi;" + ilkHarf);


    }

}
