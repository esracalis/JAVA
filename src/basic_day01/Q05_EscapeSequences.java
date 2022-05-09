package basic_day01;

public class Q05_EscapeSequences {
    public static void main(String[] args) {

        /*
 \n (or \r): starts from a new line : metni bir alt satirdan itibaren yazdirir.
         \t:  horizontal tab : metni yatayda 1 tab miktari kaydirir.
         \\: prints a back slash :\ (ters slash) yazdirir
         \': prints single quote :' tek tirnak yazdirir.
         \": prints double quote :"" cift tirnak yazdirir.
\: backslash
/:front slash
*/
        System.out.println("   \"Hello \", \"World \\ //\"");
        // Soru-2 : Pazartesi kelimesini her harfini ayri bir satira gelecek sekilde yazdırınız.
        //Soru-3 : "Java" ile hayat cok 'afilli'   yazdiriniz
        //Soru-4 : "Zaruret" insani
        //         'kasif'  yapar   yazdiriniz
        // sonraki "TechProEd ile java cok kolay ..." ifadesi
        // 3 satir sonra ve satir basindan 1 tab ileride yazilsin.

        //2

        System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");

        //3
        System.out.println("\"Java\" ile hayat cok \'afilli\'");

        //4



        System.out.println("\"zaruret\" insani\n\'kasif\' " +
                "yapar\n\n\n\t\"TechProEd ile java cok kolay ...\"");
    }
}
