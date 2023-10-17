//10.Soru: Bir sayının asal çarpanlarını yazdıran programı yazınız
import java.util.Scanner;
public class soru10 {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayiyi giriniz: ");

        int sayi=scanner.nextInt();

        int bolen=2;

        int bolunen=sayi; //Bölünen olarak kullanılacak bir değişken tanımladım ve sayi değişkenine eşitledim

        System.out.println("Asal çarpanlar= ");
        while(bolen<sayi){    // Bölen sayı sayi'dan küçük olduğu sürece döngüye girmeye devam eder
            if(bolunen%bolen==0){  // Eğer bölünen sayının bölen sayıya bölümünden kalan 0 ise, yani tam bölünüyorsa bölen sayısını ekrana yazdırır
                System.out.println(bolen);
                bolunen/=bolen;
            }
            else{    //Tam bölünmüyorsa bölen sayısı 1'er 1'er artırılır
                bolen++;
            }
        }
    }
}