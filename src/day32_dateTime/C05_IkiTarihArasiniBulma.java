package day32_dateTime;
import java.time.LocalDate;
import java.time.Period;
public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun= LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1984,04,18);

        System.out.println(Period.between(dogumGunu,bugun)); // P37Y11M14D

        System.out.println(Period.between(dogumGunu,bugun).getYears()); // 37
        // FIXME: 3/31/2022
    }
}