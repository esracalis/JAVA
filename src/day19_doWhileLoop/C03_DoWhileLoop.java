package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        // 5 den kucuk sayilari yazalim

        int input=3;

        int sayi=1;
        int sayac=1;
        while (sayi<input){
            System.out.println(sayi);
            sayac++;
            sayi++;
        }
        System.out.println("sayac"+ sayac);
    }
}
