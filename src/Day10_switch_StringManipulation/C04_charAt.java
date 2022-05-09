package Day10_switch_StringManipulation;

import java.util.Locale;

public class C04_charAt {
    public static void main(String[] args) {

        String str="Java Cok Guzel";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(9));

        System.out.println(str.toLowerCase().charAt(5)+""+str.toUpperCase()
                .charAt(6)+""+str.toUpperCase().charAt(7));
        System.out.println(str.charAt(14-1));

        System.out.println(str.toUpperCase().charAt(3)+""+str.toUpperCase().charAt(7));


    }
}
