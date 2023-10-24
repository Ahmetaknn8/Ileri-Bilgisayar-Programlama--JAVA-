/*
abc üç basamaklı bir tamsayıdır ve aşağıdaki koşulları sağlamaktadır:
koşul 1 cba > abc olacak
koşul 2 abc asal sayı olacak
koşul 3 cba asal sayı olacak
koşul 4 ab asal sayı olacak
koşul 5 bc asal sayı olacak
koşul 6 cb asal sayı olacak
koşul 7 ba asal sayı olacak
Yukarıdaki koşulların hepsini sağlayan tüm abc sayılarını bulan programı yazınız.
*/
public class soru4 {

    public static void main(String[] args) {

        for(int i = 100 ; i <=999; i++)
        {
            if(Test(i))  // Test fonksiyonu ile sayının koşulları sağlayıp sağlamadığını kontrol ediyoruz
            {
                System.out.println(i);
            }
        }
    }


    public static boolean Test (int abc)
    {
        int a = abc /100; // Sayının yüzler basamağı bulunur

        int b = (abc/10) % 10; // Sayının onlar basamağı bulunur
        int c = abc %10;  // Sayının birler basamağı bulunur

        int cba = (c*100) + (b*10)+a; // Sayının tersi oluşturulur

        // Sayının ab, bc, cb ve ba şeklindeki kombinasyonlarını oluşturulur
        int ab = (a*10) + b;
        int bc = (b*10) + c;
        int cb = (c*10) + b;
        int ba = (b*10) + a;
        // Sayının ve kombinasyonlarının asal olup olmadığı ve tersinin kendisinden büyük olup olmadığı kontrol edilir.
        return cba > abc
                && IsPrime(abc)
                && IsPrime(cba)
                && IsPrime(ab)
                && IsPrime(bc)
                && IsPrime(cb)
                && IsPrime(ba);
    }

    public static boolean IsPrime(int value)
    {
        boolean cond = false; // Asallık testi için bir değişken tanımlınır ve 2'den değere kadar olan sayılara bölünebilirliği kontrol edilir
        for(int i =2 ; i < value; i++)
        {
            if(value % i == 0) // Bölünebilen bir sayı bulursa değişken true yapılarak döngüden çıkılır
            {
                cond = true;
                break;
            }
        }
        return !cond; // Değişkenin tersini döndürülür, çünkü asal olmayan sayılar için true, asal olanlar için false olması gerekiyor
    }
}