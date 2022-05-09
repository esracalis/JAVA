package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {
        String str="Bugun ne cok sey ogrendik";

        //boslik disindaki karakter sayisini bulalim

        System.out.println(str.replace(" ", "").length());

        System.out.println("orjinal str karakter sayisi: "+str.length());


        //

        str=str.replace("Bugun","yarin");
        str=str.replace("ogrendik","ogrenecegiz");
        System.out.println("kalici degisiklikten sonra:"+str);


        str.replace("ne cok","ne az");// atama yoksa degisiklik yok

    }
}
