package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {
        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5));

        System.out.println(str.replace("Java", "Mehmet hoca"));
        System.out.println("Mehmet hoca " +str.substring(5));

        System.out.println(str.substring(9));//inclusive

        System.out.println(str.substring(0,5)); //inclusive / eclusive

        String harf=str.substring(5,6);
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7));  // hiclik dondurur

       // System.out.println(str.substring(5,2)); // hata verir

        System.out.println(str.substring(str.length()-1)); // son harf
        System.out.println(str.substring(str.length()-5)); // son 5 harf
        System.out.println(str.substring(str.length())); // son harften sonraki // hiclik


    }
}
