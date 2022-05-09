package day17_forLoop;

public class esraCalisma_Loop1 {
    public static void main(String[] args) {

        //Soru 3) 100’den baslayarak 50’ye(dahil) kadar olan sayilari aralarinda virgul olarak ayni satirda
        //yazdirin

        /*for (int i =100; i >=50; i--) {
            System.out.print(i+", ");


       }

         */


        //Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
        //kati olan sayilari yazdirin.

        /*int sayi = 78;

        for (int i = 1; i <= sayi; i++) {

            if (i % 3 == 0) {
                System.out.print(i+" ");

            }
        }
  */
        //Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
        //veya 5”in kati olan sayilari yazdirin.

        /*int num=65;

        for (int i = 1; i <=num; i++) {

            if(i%3==0 || i%5==0){
                System.out.println(i+" ");
            }
        }

         */

        //Soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak
        //
        //girilen sayiya kadar tum sayilari yazdirin. Ancak;
        //- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
        //- Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
        //- Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.

        /*int num=35;

        for (int i = 0; i <num; i++) {

            if(i%3==0 && i%5==0){
                System.out.println("Java Guzeldir");

              }else if(i%3==0){
                System.out.println("Java");

                }else{
                System.out.println("Guzeldir");
                }
            }
          */

        //Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.

        String str = "Tarik";
        terstenYazdir(str);
    }
        private static void terstenYazdir (String str){
        String kelimeninTersi = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            kelimeninTersi += str.charAt(i);

        }
            System.out.println(kelimeninTersi);
    }

}