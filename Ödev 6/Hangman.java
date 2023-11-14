import java.util.Random;
import javax.swing.JOptionPane;

public class Hangman {


    private static final String[] CITIES = {"Ankara", "İstanbul", "İzmir", "Bursa", "Adana", "Antalya", "Trabzon", "Eskişehir", "Konya", "Samsun"}; // Oyun için şehir isimlerini içeren bir dizi tanımlanır

    public static void main(String[] args) {
        Random random = new Random();

        String selectedcity = CITIES[random.nextInt(CITIES.length)].toLowerCase(); // Diziden rastgele bir şehir seçilir
        int wordLenght = selectedcity.length();
        char[] secretWord = new char[wordLenght];

        for (int i = 0; i < wordLenght; i++) { // Gizli kelimenin her harfi için '_' karakteriyle başlatılır
            secretWord[i] = '_';
        }
        int point = 100;

        JOptionPane.showMessageDialog(null, "Adam Asmaca oyununa hoş geldiniz!");

        long startTime = System.currentTimeMillis(); // Oyunun başlama zamanı

        while (true) {
            String message = "Gizli kelime: " + new String(secretWord) + "\n";
            message += "Harf tahmini girin: ";
            String guess = JOptionPane.showInputDialog(message).toLowerCase();

            if (guess.length() != 1 || !Character.isLetter(guess.charAt(0))) { // Kullanıcının geçersiz girişi kontrol edilir
                JOptionPane.showMessageDialog(null, "Geçersiz giriş. Lütfen bir harf girin.");
                continue;
            }
            char character = guess.charAt(0);

            if (selectedcity.indexOf(character) != -1) { // Kullanıcının tahmininin doğru olup olmadığı kontrol edilir
                for (int i = 0; i < wordLenght; i++) {
                    if (selectedcity.charAt(i) == character) {
                        secretWord[i] = character;
                    }
                }

                if (new String(secretWord).equals(selectedcity)) { // Kullanıcı kelimeyi tamamen doğru tahmin ettiğinde oyunu bitirir
                    JOptionPane.showMessageDialog(null, "Tebrikler! Doğru şehri buldunuz: " + selectedcity);
                    break;
                }
            } else { // Yanlış tahmin durumunda puan düşer

                JOptionPane.showMessageDialog(null, "Yanlış tahmin. Puan kaybı.");
                point -= 10;
            }


            long passingTime = (System.currentTimeMillis() - startTime) / 1000; // Geçen süreye göre puanlama yapılır

            if (passingTime <= 20) {
                point += 5;
            } else if (passingTime <= 30) {
                point -= 10;
            }

            if (point <= 0) { // Puan sıfır veya altına düşerse oyunu kaybeder
                JOptionPane.showMessageDialog(null, "Maalesef puanınız kalmadı. Oyunu kaybettiniz.");
                break;
            }


            message = "Geçen süre: " + passingTime + " saniye\n";
            message += "Puanınız: " + point;
            JOptionPane.showMessageDialog(null, message); // Oyunun durumu ekrana yazdırılır
        }
    }

}
