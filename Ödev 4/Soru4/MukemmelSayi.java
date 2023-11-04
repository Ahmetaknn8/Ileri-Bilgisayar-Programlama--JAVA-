/* Soru4: Kendisi haricindeki tüm poziƟf bölenlerinin toplamına eşit olan tamsayılara "mükemmel sayı" (perfect number) denir.
        Örneğin 6 ve 28 sayıları mükemmel sayılardır:
        6 = 1 + 2 + 3
        28 = 1 + 2 + 4 + 7 + 14
   a)Parametresi ile aldığı int türden bir değerin mükemmel sayı olup olmadığını test eden isPerfect metodunu yazınız. Metot sayı mükemmel ise true mükemmel değil ise false değerine geri dönecekƟr.
 */
import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        // Kullanıcıdan input alınarak n değişkenine atanır
        Scanner scanner = new Scanner(System.in);
        System.out.print("Test etmek istediğiniz sayıyı giriniz: ");
        int n = scanner.nextInt();
        if (isPerfect(n)) { // isPerfect metodundaki döndürlüllen sayı n değişkenine eşitse yani sayı mükemmel ise
            System.out.println( sumFactors(n) +" mükemmel sayıdır."); // Onay mesajı yazdırlır
        } else { // değilse
            System.out.println(n + " mükemmel sayı değildir."); // uyarı mesajı yazdılır.
        }
    }
    // Bir sayının kendisi hariç bölenlerinin toplamını hesaplayan sumFactor metodu tanımlanıp parametre olarak bir n sayısı alınır
    public static int sumFactors(int n) {
        int sum = 0; // Bölenlerin toplamını tutan sum değişkeni tanımlanıp 0 olarak atanır
        for (int i = 1; i <= n / 2; i++) { // 1'den n/2'ye kadar bir döngü başlatılır
            if (n % i == 0) { // Eğer n, i'ye tam bölünüyorsa
                sum += i;     //i bölenlerin toplamına (sum) eklenir
            }
        }
        return sum; // Bölenlerin toplamı döndürülür
    }

    public static boolean isPerfect(int n) { // Bir sayının mükemmel sayı olup olmadığını test eden isPerfect metodu tanımlanır
        return sumFactors(n) == n; //Eğer n'nin bölenlerinin toplamı yine n'ye eşitse metod true, değilse false döndürür
    }
}