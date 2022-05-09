package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {

        int baslangic=40;
        int bitis=60;

    // kullanicidan iki tam sayi alip, bu sayilari ve aralarindaki
        //tum tam sayilari yazdiran bir kod olusturun.

        for (int i = baslangic; i <=bitis; i++) {
            System.out.print(i+" ");
            
        }
        System.out.println("");

        // while loop ile yapalim

        int i=baslangic;
        while (i<=bitis){
            System.out.print(i+" ");
          i++;

        }
        System.out.println("");
        System.out.println(baslangic);
    }
}
