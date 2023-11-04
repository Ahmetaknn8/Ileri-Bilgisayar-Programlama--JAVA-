// Soru1d : Bir Java programı yazarak e sayısını seri toplamıyla hesaplayarak ekrana yazdırınız.

public class MaclaurinSeriesOfE {

    public static void main(String[] args) {
        int n = 10; // Seri toplamının kaç terimini alacağımızı belirleyen bir tam sayı değişkeni tanımladım ve bunu 10 terim olarak isteğe bağlı olarak belirledim.
        double e = MaclaurinSeriesOfE(n); // e sayısını hesaplamak için MaclaurinSeriesOfE adıyla aşağıda oluşturduğum metodu çağırdım ve sonucu bir ondalık sayı değişkenine atadım
        System.out.println("e sayısı: " + e); // e sayısı ekrana yazdırılır
    }

    public static double MaclaurinSeriesOfE(int n) { // e sayısının seri toplamını hesaplayan bir metod tanımladım, parametre olarak seri toplamının kaç terimini alacağını belirten bir tam sayı aldım
        double eApproximate = 1.0; // e sayısının yaklaşık değerini tutan bir ondalık sayı değişkeni tanımladım ve ilk terim olan 1.0 olarak atadım
        double factorial = 1.0; // Faktöriyel hesabı yapmak için bir ondalık sayı değişkeni tanımladım ve 1.0 olarak atadım

        // Seri toplamı için birinci teriminden başlayarak n. terimine kadar giden bir döngü başlar
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Faktöriyel değişkeni i ile çarpılır ve sonucu yine faktöriyel değişkenine atanır
            eApproximate += 1.0 / factorial; // e sayısının yaklaşık değerine 1/faktöriyel değeri eklenip sonucu yine e sayısının yaklaşık değerine atanır
        }

        return eApproximate; // e sayısının yaklaşık değeri döndürülür
    }
}
