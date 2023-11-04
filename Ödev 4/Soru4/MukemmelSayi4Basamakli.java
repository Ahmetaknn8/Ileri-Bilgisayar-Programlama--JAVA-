/* Soru4: Kendisi haricindeki tüm poziƟf bölenlerinin toplamına eşit olan tamsayılara "mükemmel sayı" (perfect number) denir.
        Örneğin 6 ve 28 sayıları mükemmel sayılardır:
        6 = 1 + 2 + 3
        28 = 1 + 2 + 4 + 7 + 14
   b) 4 basamaklı tek bir mükemmel sayı vardır. Yazmış olduğunuz isPerfect metodunu kullanarak 4 basamaklı mükemmel sayıyı bulan programı yazınız.
 */
public class MukemmelSayi4Basamakli {
    public static void main(String[] args) {
       for(int a = 1000; a < 10000; a++)
        if (isPerfect(a)) {
            System.out.println( sumFactors(a) +" dört basamaklı tek mükemmel sayıdır.");

        }
    }
    // Bir sayının kendisi hariç bölenlerinin toplamını hesaplayan sumFactor metodu tanımlanıp parametre olarak bir n sayısı alınır
    public static int sumFactors(int n) {
        int sum = 0; // Bölenlerin toplamını tutan sum değişkeni tanımlanıp 0 olarak atanır
        for (int i = 1; i <= n / 2; i++) { // 1'den n/2'ye kadar bir döngü başlatılır
            if (n % i == 0) { // Eğer n, i'ye tam bölünüyorsa
                sum += i;     //i bölenlerin toplamına (sum'a) eklenir
            }
        }
        return sum; // Bölenlerin toplamı döndürülür
    }

    public static boolean isPerfect(int n) { // Bir sayının mükemmel sayı olup olmadığını test eden isPerfect metodu tanımlanır
        return sumFactors(n) == n; //Eğer n'nin bölenlerinin toplamı yine n'ye eşitse metod true, değilse false döndürür
    }
}