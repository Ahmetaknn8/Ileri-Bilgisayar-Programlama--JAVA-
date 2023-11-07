/* Soru1a: UML nedir? En yaygın kullanılan UML nedir? İşlevleri ile yazınız.

UML, Birleşik Modelleme Dili anlamına gelir. Yazılım sistemlerinin yapısını, davranışını ve mimarisini görsel olarak tanımlamak ve iletmek için kullanılan standart bir dildir.
UML, Object Management Group (OMG) tarafından geliştirildi ve 1997'de piyasaya sürüldü. UML, nesne yönelimli programlama kavramlarını destekler ve yazılım geliştirme sürecinin her aşamasında kullanılabilir.
UML'de farklı amaçlar için kullanılan birçok diyagram türü vardır.

En yaygın kullanılan UML diyagramları şunlardır:
Sınıf diyagramı: Sistemdeki sınıfları, özellikleri, yöntemleri ve aralarındaki ilişkileri gösterir. Sistemin statik yapısını temsil eder.
Kullanım senaryosu diyagramı: Sistemdeki aktörleri, kullanım durumlarını ve aralarındaki etkileşimleri gösterir. Sistemin fonksiyonel gereksinimlerini ve kullanıcıların beklentilerini temsil eder.
Etkinlik diyagramı: Bir sistemdeki iş akışını, etkinlikleri, karar noktalarını ve eşzamanlılığı gösterir. Sistemin davranışsal dinamiklerini temsil eder.
Sıra diyagramı: Sistemdeki nesneler arasında geçen mesajların sırasını ve zamanlamasını gösterir. Sistemin etkileşimli dinamiklerini temsil eder.
Bileşen şeması: Sistemdeki bileşenleri, arayüzleri ve bağımlılıkları gösterir. Sistemin fiziksel yapısını ve dağılımını temsil eder.

UML diyagramlarının işlevleri, sistemi daha iyi anlamak, tasarlamak, belgelemek ve iletişim kurmak için kullanılmalarıdır.
UML diyagramları, yazılım geliştiriciler, iş analistleri, müşteriler, yöneticiler ve diğer paydaşlar arasında ortak bir dil sağlar.
UML diyagramları, yazılım kalitesini artırmak, hataları azaltmak, maliyetleri düşürmek ve zaman kazanmak için de kullanılmaktadır.
 */

/* Soru1b: ArrayList, LinkedList, HashMap, HastSet farklarını ve kullanış amaçlarını belirtiniz.

ArrayList, LinkedList, HashMap ve HashSet, Java’da sıkça kullanılan koleksiyon tipleridir. Bu koleksiyonlar, verileri farklı şekillerde depolarlar ve işlerler.

ArrayList: verileri dizilerde (array) saklar. Verilere indeks numarasına göre erişilebilir. Veri ekleme ve silme işlemleri zaman alıcıdır çünkü dizinin boyutunun değiştirilmesi gerekir.Verilerin konumu bilindiği için veri alımı hızlıdır.
Veriler sıralı olarak tutulur. Aynı verinin birden fazla örneği olabilir. ArrayList, verilerin sıklıkla arandığı, ancak az eklendiği veya silindiği durumlarda kullanılır. Örneğin, bir öğrenci listesi, bir alışveriş sepeti, bir kitaplık gibi.

LinkedList: Verileri bir bağlı liste (linked list) içinde depolar. Veriler,birbirine bağlı düğümlerden oluşur. erdüğüm,veriyi ve sonraki düğümün referansını tutar.
Verilere dizin numarasına göre erişilebilir, ancak baştan veya sondan başlayarak arama yapmak gerekir. Veri ekleme ve silme,yalnızca düğümlerin bağlantılarını değiştirdiği için hızlıdır.
Verilerin yeri bilinmediği için geri getirme zaman alır. Veriler sıralı olarak tutulur. Aynı verinin birden fazla örneği olabilir.
LinkedList, verilerin sıklıkla eklendiği veya silindiği, ancak az arandığı durumlarda kullanılır.

HashMap: Verileri bir tablo (table) içinde depolar. Veriler,anahtar-değer(key-value)çiftleri şeklinde tutulur.
Verilere anahtar ile erişilebilir. Anahtarların tablodaki konumu bir hash fonksiyonu ile hesaplanır,böylece veriler hızlı bir şekilde eklenebilir, silinebilir ve alınabilir.
Veriler sırasız tutulur.Yalnızca bir aynı anahtar vardır, ancak bir kaç aynı değer mevcuttur.
Hashmap, verilerin anahtar-değer çiftleri şeklinde tutulması gerektiği durumlarda kullanılır. Örneğin, bir telefon rehberi, bir sözlük gibi.

HashSet: Verileri bir küme (set) içinde depolar. Veriler, bir HashMap’in anahtarları gibi tutulur. Verilere veri ile erişilebilir. Veri ekleme, silme ve arama işlemleri hızlıdır, çünkü verinin kümedeki konumu bir hash fonksiyonu ile hesaplanır.
Veriler sırasız olarak tutulur. Aynı veriden sadece bir tane olabilir.
HashSet, Verilerin küme mantığına uygun şekilde tutulması gerektiği durumlarda kullanılır. Örneğin, bir etiket listesi, bir kategori listesi gibi.
 */
