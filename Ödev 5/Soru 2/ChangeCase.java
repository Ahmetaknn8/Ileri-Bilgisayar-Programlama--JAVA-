/* Soru 2
Parametresi ile aldığı yazının içindeki küçük harfleri büyük harfe,
büyük harfleri ise küçük harfe çevirip yeni bir String ile geri dönen changeCase isimli metodu yazınız.
 */

import java.util.Scanner;

public class ChangeCase {

    public static String changeCase(String yazı) {

        String fullText = "";

        for (int i = 0; i < yazı.length(); i++) { // Yazının uzunluğu kadar döngü yapılır

            char character = yazı.charAt(i); // Yazının i. karakterini alınır
         // küçük harfleri büyük harflere, büyük harfleri de küçük harflere çevirmek için sırasıyla toUpperCase() ve toLowerCase metodunu uyguluyoruz.
            if (Character.isLowerCase(character)) { // Karakter küçük harf ise büyük harfe çevirir
                character = Character.toUpperCase(character);
            }
            else if (Character.isUpperCase(character)) { // Karakter büyük harf ise küçük harfe çevirir
                character = Character.toLowerCase(character);
            }

            fullText += character;  // Karakteri yeni yazıya ekler
        }

        return fullText;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir yazı giriniz:");

        String yazı = scanner.nextLine();

     

        System.out.println(changeCase(yazı)); // changeCase metodunu çağırır ve sonuç ekrana yazdırılır
    }
}