package esraCALISMA;

import java.util.Arrays;

public class Split1 {
    public static void main(String[] args) {

        String str="Java gun gectikce guzellesiyor";
        String[] kelime= str.split(" ");
        System.out.println(Arrays.toString(kelime));

        System.out.println(kelime[3]);

        String gun[]=str.split("gun");
        System.out.println(Arrays.toString(gun));

        String[] harf=str.split("");
        System.out.println(Arrays.toString(harf));
    }
}
