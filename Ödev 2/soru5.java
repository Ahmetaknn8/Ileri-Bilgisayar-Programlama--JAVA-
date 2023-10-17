/* 5.SoruKlavyeden alınan int türden üç sayı arasındaki büyüklük-küçüklük ilişkisini küçükten büyüğe doğru < ve = sembolleriyle gösteriniz
 Açıklama : Program üç tane int türden sayı isteyecek, aralarındaki ilişkiyi ekranda gösterecek */
import java.util.Scanner;
import java.util.Arrays;

public class soru5 {

    //Öncelikle kullanıcıdan teker teker input girişi alıp scan ederiz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, sayi3;

        System.out.println("Birinci sayiyi giriniz: ");
        sayi1 = input.nextInt();

        System.out.println("İkinci sayiyi giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("Üçüncü sayiyi giriniz: ");
        sayi3 = input.nextInt();

        int[] arr = {sayi1, sayi2, sayi3};
        //sort() metodunu kullanarak karşılaştırma işlemlerini yapabiliriz
        Arrays.sort(arr);

        if (arr[0] == arr[2]) {
            System.out.println(arr[0] + " = " + arr[1] + " = " + arr[2]);
        }
        else if (arr[0] < arr[1] && arr[1] == arr[2]) {
            System.out.println(arr[0] + " < " + arr[1] + " = " + arr[2]);
        }
        else if (arr[0] == arr[1] && arr[1] < arr[2]) {
            System.out.println(arr[0] + " = " + arr[1] + " < " + arr[2]);
        }
        else {
            System.out.println(arr[0] + " < " + arr[1] + " < " + arr[2]);
        }
    }
}