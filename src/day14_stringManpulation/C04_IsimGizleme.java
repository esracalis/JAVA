package day14_stringManpulation;

public class C04_IsimGizleme {
    public static void main(String[] args) {
        String isim= "Oguzhan";
        String soyisim="Balkaya";
        String kKNo="1234567890543098";

        String yeniIsim= isim.substring(0,1).toUpperCase()+
                         isim.substring(1).replaceAll("\\S","*");

        String yeniSoyisim=soyisim.substring(0,1).toUpperCase()+
                           soyisim.substring(1).replaceAll("\\S","*");


          String yeniKKNo="**** **** ***" +kKNo.substring(12);

        System.out.println("isim-soyisim"+ yeniIsim+" " +
                ""+yeniSoyisim+ "\nkart no"+""+ "yeniKKNo");
    }
}
