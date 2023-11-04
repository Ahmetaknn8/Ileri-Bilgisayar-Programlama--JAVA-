/* Soru2: Parametresi ile aldığı pozitif bir tamsayının kendisi hariç tüm çarpanlarının toplamı ile geri dönen sumFactors metodunu yazınız.
        Metot parametresi ile aldığı sayı hariç tüm çarpanlarının toplamına geri dönecektir:
        (1 her sayının doğal çarpanıdır ve toplama dahil edilecektir.)
*/
import java.util.Scanner;
public class sumFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //kullanıcıdan input alınır
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt(); //alınan input n değişkenine atanır
        System.out.println(n + " sayısının SumFactorü= " + sumFactors(n)); // sumFactors metodu çağırılır ve sonucu ekrana yazdırılır
    }

    public static int sumFactors(int n) {
        // Çarpanların toplamını tutan bir tam sayı değişkeni tanımlanır ve 0 olarak atanır
        int sum = 0;
        // 1'den n'e kadar bir döngü başlar
        for (int i = 1; i < n; i++) {
            // Eğer n, i'ye tam bölünüyorsa
            if (n % i == 0) {
                // i'yi çarpanların toplamına eklenir
                sum += i;
            }
        }
        // Çarpanların toplamı döndürülür
        return sum;
    }
}