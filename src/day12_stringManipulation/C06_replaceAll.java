package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
        String isimSoyisim=scan.nextLine();

        System.out.println(isimSoyisim.replaceAll("\\s","s"));
    }
}
