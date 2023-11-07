import java.util.Scanner;

public class Squeeze {

    public static String squeeze(String text1, String text2) {
        String result = "";
        // Birinci yazının tüm karakterleri uzunluğunda döngü başlar
        for (int i = 0; i < text1.length(); i++) {

            char c = text1.charAt(i);
            // Eğer karakter ikinci yazıda yoksa yeni string'e eklenir
            if (text2.indexOf(c) == -1) {
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya iki ayrı yazı girmesini isteriz
        System.out.println("Lütfen ilk yazıyı giriniz:");
        String text1 = scanner.nextLine();

        System.out.println("Lütfen ikinci yazıyı giriniz:");
        String text2 = scanner.nextLine();

        System.out.println("Squeeze sonucu: " + squeeze(text1, text2)); // Squeeze metodunu çağırıp sonuç ekrana yazdırılır

    }
}