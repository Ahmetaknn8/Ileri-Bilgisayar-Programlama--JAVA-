/*Soru1c: Aşağıdaki tabloda herhangi bir programının şifre belirleme arayüzü verilmiştir.
  Aşağıdaki koşulları yerine getiren şifre oluşturulması sağlayan java programını yazınız.
  (Not:joptionpane.showinputdialog yapılarını kullanabilirsiniz.) */
import javax.swing.JOptionPane;
public class PasswordGenerator {

    public static void main(String[] args) { // Ana metod tanımlanır
        String password = JOptionPane.showInputDialog("Şifrenizi girin:"); // Kullanıcıdan bir şifre girmesini isteyen bir dialog kutusu oluşturulur ve şifre bir String değişkene atanır
        if (password == null) { // Eğer kullanıcı şifre girmeden iptal ederse
            JOptionPane.showMessageDialog(null, "Eksik işlem yapıldı."); // Bir hata mesajı gösterilir
        } else if (password.length() < 8 || password.length() > 95) { // Eğer şifre 8 karakterden kısa veya 95 karakterden uzunsa
            JOptionPane.showMessageDialog(null, "Şifre en az 8 karakter olmalı ve 95 karakterden uzun olmamalıdır."); // Bir hata mesajı gösterilir
            main(args); // Ana metodu tekrar çağırılır
        } else if (!password.matches(".*\\d.*")) { // Eğer şifre en az bir sayı içermiyorsa
            JOptionPane.showMessageDialog(null, "Şifre en az bir sayı içermelidir."); // Bir hata mesajı gösterilir
            main(args);
        } else if (!password.matches("\\S+")) { // Eğer şifrenin başında veya sonunda boşluk karakterleri varsa
            JOptionPane.showMessageDialog(null, "Şifrenin başında veya sonunda boşluk olmamalıdır."); // Bir hata mesajı gösterilir
            main(args);
        } else if (!password.matches(".*[a-zA-Z].*")) { // Eğer şifre en az bir harf içermiyorsa
            JOptionPane.showMessageDialog(null, "Şifre en az bir harf içermelidir."); // Bir hata mesajı gösterilir
            main(args);
        } else if (!password.matches(".*[!@#\\$%\\^&\\*\\(\\)_\\-\\+=\\{\\}\\[\\]\\|;:'\",\\.\\<\\>/\\?].*")) { // Eğer şifre en az bir özel karakter içermiyorsa
            JOptionPane.showMessageDialog(null, "Şifre en az bir özel karakter içermelidir."); // Bir hata mesajı gösterilir
            main(args);
        } else { // Eğer şifre tüm koşulları sağlıyorsa
            JOptionPane.showMessageDialog(null, "Şifre geçerlidir!"); // Bir onay mesajı gösterilir
        }
    }
}