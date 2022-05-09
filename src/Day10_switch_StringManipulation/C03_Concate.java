package Day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {
        String str1= "Java";
        String str2= "Candir";

        System.out.println(str1+" "+str2); //Java candir

        String cumle=str1.concat(str2);
        cumle= str1.concat(" ").concat(str2);

        String word1="Esra";
        String word2="Aslan";

        String isim=word1.concat(" ").concat(word2);
        System.out.println(isim);

    }
}
