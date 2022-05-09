package esraCALISMA;

public class whileLoop1 {


    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {

        int num=1234;
        int rakam=0;
        int rakamlarToplami=0;

        while(num>0){

            rakam=num%10;
            rakamlarToplami+=rakam;
            num=num/10;



        }
        System.out.println(rakamlarToplami);
    }
}