//8.Soru: Klavyeden bir n sayısı okuyunuz ve aşağıdaki deseni oluşturan programı yazınız
import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        System.out.print("Bir n sayisi girin: ");
        int n = sayi.nextInt();
//Öncelikle boşlukları oluşturmak için boşluk değerlerini yukarıdan aşağıya azaltacak for döngüsünü yazdım
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
                 for (int j = 1; j <= 2 * i - 1; j++) { //boşlukların ardından *'ların satırlar arttıkça çoğalmasını sağlayacak for döngüsünü yazdım
                     System.out.print("*");
                 }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) { //satırlar boyunca satır sayısı arttıkça artacak boşlukları oluşturan for döngüsünü yazdım.
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { //satırlar boyunca satır sayısı arttıkça azalacak * kümesini oluşturan for döngüsünü yazdım
                System.out.print("*");
            }
            System.out.println();
        }
    }
}