import java.util.Locale;
import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Y ya da N harflerinden birini giriniz");

        String harf1 = scan.nextLine().toLowerCase();
        String harf2 = scan.nextLine().toLowerCase();



        if (harf1.equals("Y")){
            System.out.println("YES");

        } else if(harf2.equals("N")) {
            System.out.println("NO");
        }
        System.out.println();
    }
}
