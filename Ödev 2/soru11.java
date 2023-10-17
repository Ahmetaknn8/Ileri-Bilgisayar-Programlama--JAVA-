//11.Soru: Klavyeden bir height ve width değişkenleri için sayılar okuyunuz ve dikdörtgenin içerisinde zikzak çizen yıldızlardan oluşan deseni oluşturunuz:
import javax.swing.JOptionPane;

public class soru11 {

    public static void main(String[] args) {

        String height=JOptionPane.showInputDialog("Yükseklik Değerini giriniz.");
        String width=JOptionPane.showInputDialog("Genişlik Değerini giriniz.");

        //string olarak girilen değerler int tipine dönüştürülür
        int h = Integer.parseInt(height);
        int w = Integer.parseInt(width);


        int pozisyon = 0;             // Yıldızın konumunu belirleyen bir değişken tanımlanarak 0'a eşitledim
        boolean ileri = true;      // Yıldızın ileri mi yoksa geri mi hareket ettiğini belirleyen mantıksal değerlendirme veri tipi olan boolean tipinde bir değişken tanımlayıp true'a eşitledim
           for(int i = 0 ; i<h; i++)    // Yükseklik kadar döngüye girmesi için for döngüsü kullandım
        {
            System.out.print("|");  // Her satırın başında ve sonunda '|' karakteri yazdırılır
            for(int j = 0 ; j<w ; j++)   // Genişlik kadar döngüye girmesi için for döngüsü kullandım
            {
                if(j == pozisyon)   // Eğer j sayısı position ile aynı ise, yani yıldızın konumu ise yıldız karakteri yazdırılır
                {
                    System.out.print("*");
                }
                else                // Eğer değilse boşluk karakteri yazdırılır
                {
                    System.out.print(" ");   // Her satırın başında ve sonunda '|' karakteri yazdırılır
                }
            }
            System.out.println("|");

            if(ileri)
            {
                pozisyon++;     // Eğer yıldız ileri hareket ediyorsa 'pozisyon' değeri 1 arttırılır
            }
            else
            {
                pozisyon--;     // Eğer yıldız geri hareket ediyorsa 'pozisyon' değeri 1 azaltılır
            }
            if(pozisyon == w-1 || pozisyon == 0)
            {
                ileri = ! ileri;      /* Eğer 'pozisyon' değeri genişliğin bir eksiği veya sıfır ise,
                                          yani yıldız çerçevenin kenarına geldiyse 'ileri' değerinin tersi alanarak yön değiştirilir */
            }
        }
    }
}