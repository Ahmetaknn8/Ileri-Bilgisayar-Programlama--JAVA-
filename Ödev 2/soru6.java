// 6.Soru: Parametresi ile aldığı int türden 3 sayıdan ortancasına geri dönen mid isimli metodu yazınız ve test ediniz.
import java.util.Scanner;
public class soru6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x,y,z;
        //kullanıcıdan değer girdisi alınır
        System.out.println("1. sayiyi giriniz=");
        x=input.nextInt();

        System.out.println("2. sayiyi giriniz=");
        y=input.nextInt();

        System.out.println("3. sayiyi giriniz=");
        z=input.nextInt();
        //if fonksiyonu ile "ve" "&&" ve veya anlamındaki "||" koşulları uygulanır.
        if(y>x && y<z || y>z && y<x)
            System.out.println("Ortanca Sayi =" + y);
        if(x>y && x<z || x>z && x<y)
            System.out.println("Ortanca Sayi =" + x);
        if(z>x && z<y || z>y && z<x )
            System.out.println("Ortanca Sayi =" + z);

    }
}