package basic_day01;

public class Q03_PrimitiveDataTypes_ {
    public static void main(String[] args) {

        /*
         * Primitive data type
                byte: only takes whole numbers
                short: only takes whole numbers
                int(used more often): only takes whole numbers
                long: only takes whole numbers
                float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
                boolean: true or false boolean expressions
                char: character within single quote ''
                        also takes number
         * Range: double > float >long > int >short > byte
         */
        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.
        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        byte byteMaximum= Byte.MAX_VALUE;
        System.out.println("byteMaximum = " + byteMaximum);

        byte byteMinimum= Byte.MIN_VALUE;
        System.out.println("byteMinimum = " + byteMinimum);

        short shortMaximum=Short.MAX_VALUE;
        System.out.println("shortMaximum = " + shortMaximum);

        short shortMinimum= Short.MIN_VALUE;
        System.out.println("shortMinimum = " + shortMinimum);

        int intMinimum= Integer.MIN_VALUE;
        System.out.println("intMinimum = " + intMinimum);

        int intMaximum= Integer.MAX_VALUE;
        System.out.println("intMaximum = " + intMaximum);

        //
        float laptopFiyat= 9999.99f;
        double kilometre= 567.98;
        char cinsiyet='E';
        boolean dogruMu=false;

        System.out.println("laptopFiyat = " + laptopFiyat);
        System.out.println();

        System.out.println(laptopFiyat +" " + kilometre + " " + cinsiyet + " " + dogruMu);
    }
}
