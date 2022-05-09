package esraCALISMA;

public class BinarySearch {

    public static void main(String[] args) {

        int arr[]= {5,2,5,8,88,55,14,3};
        int istenenSayi=3;

        arananSayi(arr,istenenSayi);
    }

    private static void arananSayi(int[] arr, int istenenSayi) {
         boolean sonuc=false;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==istenenSayi){
                sonuc=true;
                break;
            }

        }System.out.println(sonuc);


    }
}
