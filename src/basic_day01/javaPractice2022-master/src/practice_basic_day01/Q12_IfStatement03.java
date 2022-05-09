import java.util.Scanner;

public class Q12_IfStatement03 {
		/*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen is unvanininizi giriniz");

            String jobTitle =scan.next().toLowerCase();

            if (jobTitle.equals("qa")){
                System.out.println("Quality Analyst");
            }
            if (jobTitle.equals("dev")){
                System.out.println("developer");

            }
            if (jobTitle.equals("ba")) {
                System.out.println("Bussines Analyst");
            }
            if (jobTitle.equals("pm")){
                System.out.println("Project Analist");
        }
}
}