import java.util.Scanner;

public class Q13_Ternary {
    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir fiyat giriniz");
        int fiyat = scan.nextInt();

        if (fiyat < 10) {
            System.out.println("ucuz");
        } else if (fiyat < 20) {
            System.out.println("normal");

        } else if (fiyat == 20 || fiyat > 20) {
            System.out.println("pahali");
        }else {
            System.out.println("Girdigniz deger yanlistir");

            //

            String sonuc = (fiyat < 10) ? "ucuz" : fiyat < 20 ?
                    "normal" : "pahali";
            System.out.println(sonuc);


        }

  }

}
