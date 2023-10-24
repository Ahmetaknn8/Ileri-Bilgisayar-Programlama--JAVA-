/*
Soru 5: Aşağıda açıklanan isPrimeX isimli metodu yazınız:
isPrimeX metodu içerisinde, gönderilen argumanın asal olup olmadığı test edilecek, eğer sayı  asal  ise  bu  kez  sayının
  basamak  değerleri  toplanarak  elde  edilen  sayının  asal  olup olmadığı  test  edilecektir.  Bu  işlem  sonuçta  tek
  basamaklı  bir  sayı  kalana  kadar devam edilecektir. Eğer en son elde edilen tek basamaklı sayı dahil tüm sayılar asal
  ise isPrimeX metodu true değerine geri dönecektir. Eğer herhangi bir kademede asal olmayan bir sayı elde edilirse metot
  false değerine geri dönecektir.
 */
import java.util.Scanner;
public class soru5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        boolean result = isPrimeX(number); // isPrimeX metodu ile sayının özel asal olup olmadığını kontrol edilir

    }

    public static boolean isPrime(int num) {

        if (num <= 1) {    // Sayı 1'den küçük veya eşitse asal değildir
            return false;
        }
        if (num <= 3) { // Sayı 2 veya 3 ise asaldır
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) { // Sayı 2 veya 3'e tam bölünüyorsa asal değildir
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {   // Sayı i veya i+2'ye tam bölünüyorsa asal değildir
                return false;
            }
        }
        return true;
    }

    public static int sumOfDigits(int num) { //sumOfDigits metodu ile girilen sayının rakamlarının toplanmasını sağlarız
        int sum = 0; // Basamakların toplamını tutacak bir değişken (sum) tanımlıyoruz
        while (num > 0) {   // Sayı sıfır olana kadar döngüye giriyoruz
            int digit = num % 10;  // Sayının birler basamağını buluyoruz
            sum += digit; // her bir basamağı toplama ekliyip sayıyı 10'a bölerek bir basamak daha ekliyoruz.
            num /= 10;
        }
        return sum;
    }

    public static boolean isPrimeX(int num) {
        while (num >= 10) {
            if (!isPrime(num)) {
                System.out.println(num + " değeri asal değildir.");
                return false;
            }
            System.out.println(num + " değeri asaldır.");
            num = sumOfDigits(num);

        }
        return false;
    }
}
