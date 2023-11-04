/* Soru1a: Unit Test nedir? Neden Unit Test yaparız?  Unit Test Frameworkları listeleyiniz.  Unit Test için uyulması gereken kuralları belirƟniz.

Unit Test, yazılımda bir birimin tasarlanan işlevini yerine getirip getirmediğini test etmek için kullanılan bir yöntemdir.
Bu yöntem, kodun kalitesini ve güvenliğini artırmak için gereklidir. Çünkü kodda değişiklik yaparken,
Unit Test sayesinde kodun doğru çalıştığını kontrol edebiliriz. Böylece, kodu yeniden düzenlemek (Refactor) daha kolay olur.
Unit Test yazmak için farklı programlama dilleri için farklı framework’ler kullanabiliriz. Bu framework’ler, test yazmayı ve çalıştırmayı kolaylaştırmak için çeşitli özellikler sunar.
Unit Test yazarken, test edilen birimin diğer birimlerden bağımsız olmasına, testlerin otomatik, hızlı, okunaklı ve hata raporu veren şekilde olmasına dikkat etmeliyiz.
Unit Test, yazılımın her biriminin doğru çalıştığını test etse de, tüm hataları ortaya çıkarmaz.
Çünkü test edilen birimler, birbirleriyle etkileşim halinde olmadan test edilir. Bu yüzden, entegrasyon testleri de yapmak gerekir.
Entegrasyon testleri, birimlerin birlikte çalışıp çalışmadığını test eder. Bu şekilde, yazılımın tüm parçalarının düzgün çalıştığından emin olabiliriz.

Framework, test yazmayı ve çalıştırmayı kolaylaştıran bir araç seti veya kütüphanedir.
Unit Test için kullanılan birçok framework bulunmaktadır. Bunlardan bazıları şunlardır:

JUnit: Java programlama dili için popüler bir unit test framework’üdür.
       JUnit, testlerin hızlı ve bağımsız çalışmasını sağlar.
NUnit:  .NET platformu için kullanılan bir unit test framework’üdür.
        NUnit, test sonuçlarını raporlamak için XML formatını kullanır. NUnit, testlerin paralel olarak çalışmasını sağlar.
PyTest: Python dilinde kullanılan bir test framework’üdür. PyTest, basit ve esnek bir yapıya sahiptir.
        PyTest, test sonuçlarını raporlamak için farklı plugin’ler destekler. (Plugin, bir yazılıma yeni özellikler veya işlevler eklemek için kullanılan bir eklentidir)
        PyTest, testlerin modüler ve tekrar kullanılabilir olmasını sağlar.
Mocha: JavaScript için bir test framework’üdür. Mocha, asenkron testleri destekler.
       Mocha, testlerin esnek ve yapılandırılabilir olmasını sağlar.
RSpec: Ruby programlama dili için bir test framework’üdür. RSpec, davranış odaklı bir test yaklaşımı sunar.
       RSpec, testlerin anlaşılır ve doğal bir dilde yazılmasını sağlar.
PHPUnit: PHP programlama dili için bir unit test framework’üdür.
         PHPUnit, test sonuçlarını raporlamak için XML formatını kullanır. PHPUnit, testlerin izole ve tekrarlanabilir olmasını sağlar.

Unit Test yazmak için uyulması gereken kurallar şöyle sıralanabilir :
*Test method ismi test edilen senaryonun yansıması olmalıdır.
*Test edilen kısım diğer kısımlardan bağımsız olmalıdır.
*Sadece bir senaryo test edilmelidir.
*Testler tam otomatik şekilde çalışmalıdır. Manuel müdahale gerektirmemelidir.
*Testler hızlı çalışmalıdır. Uzun süren testler, test sürecini yavaşlatır ve verimliliği düşürür.
*Testler okunaklı, anlaşılabilir ve sürdürebilir olmalıdır. Test kodu da kaliteli olmalıdır.
*Testte herhangi bir arıza tespitinde bir hata raporu döndürülmelidir. Hata raporu, hatanın nerede ve neden olduğunu açıkça belirtmelidir.

 Soru 1b: Design patern nedir? Kaç tipi vardır her tipe 2 adet örnek veriniz?

Design Patern, yazılımın geliştirme aşamasındaki yeni bir senaryoda sorunun nasıl çözüleceğini bilmek için kullanılan bir şablon yöntemidir. 3 adet tipi vardır bunlar:
1. Yaratıcı Tasarım Kalıpları (nesnelerin oluşturulması)
   a) Oluşturucu: Karmaşık nesneler oluşturmak, yapıyı ve temsili ayırmak için adım adım bir modeldir.
   b) Singleton: Bir sınıf için nesne oluşturmayı yalnızca bir örnekle sınırlar.

2. Yapısal Tasarım Kalıpları (nesneler arasındaki ilişki ve yapılar)
   a) Bağdaştırıcı: Uyumsuz arabirimlerin birlikte çalışmasına izin vermek için bir arabirimin başka bir mevcut sınıfın arabirimine nasıl değiştirileceği veya uyarlanacağı ile ilgilidir.
   b) Proxy: Erişim kontrolünü etkinleştirmek, maliyeti ve karmaşıklığı azaltmak için bir nesneyi başka bir nesneyle nasıl temsil etmeniz gerektiği ile ilgilidir.

3. Davranışsal Tasarım Kalıpları (nesneler arasındaki iletişim ve nesneler arasında sorumlulukların nasıl atandığı)
   a) Arabulucu: Sınıflar arasındaki basit iletişimi ifade eder.
   b) Ziyaretçi: Sınıfta değişiklik yapmadan sınıf üzerinde yeni bir işlem tanımlar.

 */

