package day22_Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        //verilen array`de istenen bir elementin var olup olmadigini
        //true/false yazdirarar gosteren bir method olusturun

        int arr[]={3,5,6,1,45,25,4,9,0};
        int istenenSayi=14;

        istenenElemanVarMi(arr,istenenSayi);


    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {
          boolean sonuc=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == istenenSayi) {
                sonuc=true;
                break;
            }

            }
        System.out.println(sonuc);
        }
    }
