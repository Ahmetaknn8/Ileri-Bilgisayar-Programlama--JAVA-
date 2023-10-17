       /*
        7.Soru: Parametresi ile aldığı int türden bir sayının negatif mi, 0(sıfır) mı, pozitif mi olduğunu test eden signum isimli metodu yazınız ve test ediniz.
        Metot pozitif için 1(bir), negatif için -1(eksi bir) ve sıfır için 0(sıfır) döndürecektir.
        */

import java.util.Scanner;
public class soru7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz : ");
        int sayi = input.nextInt();
        int sonuc = signum(sayi);
        System.out.println(sayi + " değeri için signum metod sonucu: " + sonuc);

    }
    public static int signum(int sayi) {
        if (sayi < 0) {
            return -1;
        } else if (sayi > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}