//1.Soru: System.out.println(Math.abs(-2147483648)); ekran çıktısını yorumlayınız.
public class soru1 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-2147483648));
        /*
         math.abs() yöntemi int veri tipindeki parametrelerin mutlak değerlerini döndürmeye
        yarayan yöntemdir. int veritipinin maksimimum değeri 2147483647 ve minimum değeri de
        -2147483647 olduğu için mat.abs() içerisine yazılan -2147483648 değeri int veritipi için
        üst limiti aştığı için -2147483648 değeri döndürülmüş olarak çıkış verilmiştir.
         */
    }
}