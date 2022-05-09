package day11_StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class esraMyClass {
    public static void main(String[] args) {

      /*  String str= "Java Guzeldir";
        // Biz string method'larini arka arkaya kullanabiliriz
        // mesela ikinci kelimenin ilk gharfini kucuk olarak yazdiralim
        // str.charAt(5); boyle yazdigimizda sonuc artik String degil char olacaktir
        // dolayisiyla String'de yapmak istegimiz tum degisiklikleri
        // once yapip sonra charAt() method'unu kullanmaliyiz
        System.out.println(str.toLowerCase().charAt(3));

        System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));

       */
       /* String str1= "Ali Can";
        String str2= "Ali" + " Can";
        System.out.println("str1 :"+ str1);
        System.out.println("str2:"+ str2);
        System.out.println("== ile karsilastir:"+(str1==str2));
        System.out.println("equals ile karsilastir:"+(str1.equals(str2)));

        String str3="";
        System.out.println("str3 :"+str3);
        System.out.println("== ile karsilastir :" +(str3==str2));
        System.out.println("eguals ile karsilastir:" + str3.equals(str2));

        String str4= "esra";
        String str5="ESRA";
        System.out.println(str4.equals(str5));
        System.out.println(str4.toUpperCase().equals(str5));

        */

        // kullaniciya derse katili katilmak istemedigini sorun
        // evet derse, cevabini ve  "derse katiliminiz onaylanmistir" yazdirin
        // hayir derse cevabini ve "Sonraki derslerimize bekleriz" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen derse katilip katilmak istemediginizi Evet/Hayir seklinde yaziniz");

        String cevap=scan.next().toLowerCase();

        if(cevap.equalsIgnoreCase("EVET")){

        }   else if (cevap.equalsIgnoreCase("Hayir")){

        }   else     {
            System.out.println("yanlis deger girdiniz");

        }
    }
}
