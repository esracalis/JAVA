package day41_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args) throws FileNotFoundException {

        String dosyaYolu="src/day41_exceptions/dosya";

        FileInputStream fis = new FileInputStream(dosyaYolu);
    }
}
