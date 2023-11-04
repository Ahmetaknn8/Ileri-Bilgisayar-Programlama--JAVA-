/* Soru3: x ve y poziƟf tamsayılar olmak üzere eğer x sayısının kendisi hariç bölenleri toplamı y sayısına ve aynı zamanda y sayısının
          kendisi hariç bölenleri toplamı x sayısına eşit ise bu sayılar arkadaşƨr denir.
          Örneğin 220 ve 284 sayıları arkadaş sayılardır. Parametre olarak aldığı iki tamsayının arkadaş olup olmadıklarını test eden areFriends metodunu yazınız.
          Metodunuzu dört basamaklı bir arkadaş sayı çiŌi bulan bir kodla test edebilirsiniz.
*/
import java.util.Scanner;
class ArkadasSayilar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İki tamsayı girin: ");  // kullanıcından input alınır
        int x = scanner.nextInt();  //ilk sayı x değişkenine atanır
        int y = scanner.nextInt();  //ikinci sayı y değişkenine atanır

        // ArkadasSayilar metodundan gelen koşul değerlendirmeleri sonucu true ise ilk false ise 2. kısım yazdırılır
        if (ArkadasSayilar(x, y)) {
            System.out.println(x + " ve " + y + " arkadaş sayılardır.");
        } else {
            System.out.println(x + " ve " + y + " arkadaş sayı değillerdir.");
        }
    }


    public static boolean ArkadasSayilar(int x, int y) {

        int sumX = 0; // x sayısının kendisi hariç bölenlerinin toplamını tutan bir tam sayı değişkeni tanımnıp 0 olarak atanır

        int sumY = 0; // y sayısının kendisi hariç bölenlerinin toplamını tutan bir tam sayı değişkeni tanımlanıp 0 olarak atanır


        for (int i = 1; i < x; i++) {  // x sayısının 1'den x'e kadar olan tüm bölenlerini bulmak için bir döngü başlatılır
            if (x % i == 0) {          // Eğer x, i'ye tam bölünüyorsa
                sumX += i;             // i, x sayısının bölenleri toplamına eklenir
            }
        }

        for (int j = 1; j < y; j++) {   // y sayısının 1'den y'e kadar olan tüm bölenlerini bulmak için bir döngü başlatılır
            if (y % j == 0) {           // Eğer y, j'ye tam bölünüyorsa
                sumY += j;              // j, y sayısının bölenlerinin toplamına eklenir
            }
        }


        if (sumX == y && sumY == x) {  // Eğer x sayısının bölenlerinin toplamı y'ye ve y sayısının bölenlerinin toplamı x'e eşitse
            return true;               // Bu iki sayı arkadaş sayıdır, true döndürülür
        } else {                       // Eğer x sayısının bölenlerinin toplamı y'ye ve y sayısının bölenlerinin toplamı x'e eşit değilse
            return false;              // Bu iki sayı arkadaş sayı değildir, false döndürülür
        }
    }
}
