package esraCALISMA;

import java.util.Scanner;

public class forLoop2 {
    /*

               A
              BBB
             CCCCC
            DDDDDDD
           EEEEEEEEE
         */

   /* public static void main(String[] args) {

        int n=6;
        for (int i = 1,p='A'; i <n; i++,p++) {
            for (int j = i; j <n; j++) {
                System.out.println(" ");

            }
            for (int j = 1; j <=i; j++) {
                System.out.println((char)p);

            }
            for (int j = 1; j <=i; j++) {
                System.out.println((char)p);

            }
            System.out.println();
        }

    */

    public static void main(String[] args) {
/*
    C
    O O
    D D D
    E E E E
    R R R R R

 */
     /*         String str="CODER";
        for (int i = 0; i <str.length();i++){
            for (int j = 0; j <=i; j++) {
                System.out.print(str.charAt(i)+ " ");

            }
            System.out.println();
        }

      */

       //// Bir metindeki unique karakterleri bulan bir kod yaziniz. Hello ==> Heo

      Scanner scanner = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str= scanner.next().toLowerCase();

        for (int i = 0; i <str.length() ; i++) {

            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){

                System.out.print(str.charAt(i));
            }

        }
    }


    }

