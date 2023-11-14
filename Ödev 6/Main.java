/* Soru 1: Spring boot nedir? spring dışında başka java frameworkleri var mıdır? Eğer var ise isimleri ve işlevlerinden kısaca bahsediniz.

Cevap: Spring Boot, Java tabanlı bir framework olan Spring Framework’ün bir uzantısıdır ( Framework, programcıların sıfırdan kod yazmak yerine,
daha önceden test edilmiş ve optimize edilmiş kodları çağırmasını sağlar). Spring Boot, Spring tabanlı uygulamaların hızlı ve kolay bir şekilde
geliştirilmesini, yapılandırılmasını ve çalıştırılmasını sağlar.
Spring dışında başka java frameworkleri vardır bunlardan bazıları:

Hibernate: Bir ORM (Object-Relational Mapping) frameworküdür. Java nesnelerini veritabanı tablolarına eşlemek ve veritabanı işlemlerini gerçekleştirmek
için kullanılır.

JSF (JavaServer Faces): Bir UI (User Interface) frameworküdür. Web uygulamalarının arayüzlerini oluşturmak ve yönetmek için kullanılır. Bileşen tabanlı
bir yapıya sahiptir ve AJAX, HTML, CSS gibi teknolojilerle entegre çalışabilir.

Struts: Bir MVC (Model-View-Controller) frameworküdür. Web uygulamalarının katmanlı bir şekilde tasarlanmasına ve sunum, iş mantığı ve veri erişimi gibi
sorumlulukların ayrılmasına kapı aralar.

Soru 2: Tomcat nedir ve spring boot projelerinde neden kullanılır? Başka bir şey kullanamaz mıydı, eğer kullanabiliyorsak isimleri nelerdir?

Cevap: Apache Tomcat, Apache Software Foundation tarafından geliştirilen açık kaynaklı bir web sunucusudur. Apache Tomcat (uygulama sunucusu), Java uygulamalarını
       yürütmek ve web sayfalarını işlemek için tasarlanmıştır. Tomcat, kendi dahili web sunucusuna sahip bağımsız bir ürün olarak veya Apache, IIS gibi diğer web
       sunucularıyla birlikte kullanılabilir.
	Spring Boot projelerinde Tomcat kullanılmasının nedeni, Spring Boot’un Tomcat’i varsayılan olarak gömülü web sunucusu olarak sağlamasıdır.
	Spring Boot, Tomcat’i proje bağımlılıkları arasına ekler ve otomatik olarak yapılandırır. Bu sayede, Spring Boot uygulamaları, herhangi bir harici web
	sunucusu olmadan bağımsız olarak çalıştırılabilir. Tomcat, Spring Boot uygulamalarının hızlı, kolay ve esnek bir şekilde geliştirilmesine ve dağıtılmasında
	büyük katkıları vardır.

	Spring Boot projelerinde Tomcat dışında başka web sunucuları da kullanılabilir. Bunlardan bazıları şunlardır:
    Jetty, Undertow: Netty

Soru 3: İlişkisel veri tabanı nedir? RDBMS uygulamaları nelerdir? İlişkisel veri tabanlarında tablolar nasıl ilişkilendirilir?

Cevap: İlişkisel veritabanı, birbiriyle ilişkili veri noktalarını depolayan ve bunlara erişim sağlayan bir veritabanı türüdür. İlişkisel veritabanları tablolardaki
 verileri temsil etmenin sezgisel ve basit bir yolu olan ilişkisel modeli temel alır. İlişkisel veritabanında, tablodaki her satır, anahtar adı verilen benzersiz
 kimliğe sahip bir kayıttır. Tablonun sütunlarında verilerin öznitelikleri bulunur ve her kayıt genellikle her öznitelik için bir değer taşır. Bu da veri noktaları
 arasında ilişki kurmayı kolaylaştırır.
	RDBMS uygulamaları, ilişkisel veri tabanlarını oluşturmak, yönetmek, sorgulamak ve güncellemek için kullanılan yazılımlardır. RDBMS, veri tabanıyla kullanıcıları
	 arasında bir arayüz olarak görev görür. RDBMS, veri tabanının performansını, bütünlüğünü, güvenliğini, yedeklenmesini ve kurtarılmasını sağlar. En çok kullanılan
	 RDBMS uygulamaları şunlardır:

MySQL: Açık kaynaklı ve ücretsiz bir RDBMS uygulamasıdır. MySQL, web tabanlı uygulamalar, e-ticaret, veri ambarı ve analitik gibi çeşitli alanlarda kullanılan popüler
 ve esnek bir veri tabanı platformudur. MySQL, hızlı, kolay ve maliyet etkin bir veri tabanı çözümü sağlar.

Oracle Database: Dünyanın en çok kullanılan ticari RDBMS uygulamasıdır. Oracle Database, büyük ölçekli, karmaşık ve kritik veri tabanı sistemleri için yüksek performans,
güvenilirlik, güvenlik ve ölçeklenebilirlik sunar.

PostgreSQL: Açık kaynaklı ve ücretsiz bir RDBMS uygulamasıdır. PostgreSQL, nesne-ilişkisel bir veri tabanı modeli sunar ve SQL standartlarına uyumludur. PostgreSQL,
gelişmiş özellikler, genişletilebilirlik, istikrar ve uyumluluk sunar. .
İlişkisel veri tabanlarında tablolar, anahtarlar kullanılarak ilişkilendirilir. Anahtarlar, bir tablodaki bir veya daha fazla sütundan oluşan değerlerdir. Anahtarlar,
tablolar arasında veri bütünlüğünü sağlamak ve verileri sorgulamak için kullanılır. İlişkisel veri tabanlarında iki temel anahtar türü vardır: birincil anahtar ve yabancı anahtar.
Birincil anahtar, bir tablodaki her satırı eşsiz olarak tanımlayan bir değerdir. Bir tabloda yalnızca bir birincil anahtar olabilir ve boş veya tekrarlanan değer alamaz. Yabancı anahtar,
bir tablodaki bir değerin, başka bir tablodaki birincil anahtarla eşleştiğini gösteren bir değerdir. Bir tabloda birden fazla yabancı anahtar olabilir ve boş veya tekrarlanan değer alabilir.
Birincil ve yabancı anahtarlar arasında bir ilişki kurulduğunda, iki tablo arasında bir ilişki oluşturulmuş olur. Bu ilişki, bir tablodaki verilerin, diğer tablodaki verilerle tutarlı olmasını sağlar.

Soru 4: primary_key ve foreign_key ne demektir?
Cevap: Primary key, bir tablodaki her satırı eşsiz olarak tanımlayan bir değerdir. Primary key, veri tabanında veri bütünlüğünü sağlamak ve verileri sorgulamak için kullanılır. Bir tabloda yalnızca bir primary key
olabilir ve boş veya tekrarlanan değer alamaz. Primary key, bir tabloya oluşturulduğunda veya daha sonra eklenebilir. Primary key, bir veya birden fazla sütundan oluşabilir.
Foreign key, bir tablodaki bir değerin, başka bir tablodaki birincil anahtarla eşleştiğini gösteren bir değerdir. Foreign key, tablolar arasında ilişki kurmaya ve veri bütünlüğünü sağlamaya yarar. Foreign key,
bir tabloya oluşturulduğunda veya daha sonra eklenebilir. Foreign key, bir veya birden fazla sütundan oluşabilir.

Soru 5: rest api nedir ve nasıl çalışır?

Cevap: REST API, temsilci durum aktarımı (Representational State Transfer) uygulama programlama arayüzü anlamına gelir. REST API, farklı sistemler arasında veri alışverişini sağlamak için kullanılan bir yöntemdir.
REST API, HTTP protokolünü ve URL adreslerini kullanarak, sunucu ve istemci arasında istek ve yanıt şeklinde iletişim kurar. REST API, verileri JSON, XML, YAML gibi farklı formatlarda gönderebilir ve alabilir.
REST API, web uygulamalarının esnek, ölçeklenebilir, modüler ve bağımsız olmasını sağlar. REST API, istek ve yanıt mantığıyla çalışır. İstemci, sunucuya bir istek gönderir. Sunucu, isteği işler ve istemciye
bir yanıt gönderir. Bu şekilde, sunucu ve istemci arasında veri alışverişi sağlanır. REST API, web uygulamalarının geliştirilmesinde ve entegrasyonunda yaygın olarak kullanılan bir yöntemdir. REST API, veri tabanları,
 bulut hizmetleri, mobil uygulamalar, sosyal medya platformları, e-ticaret siteleri gibi birçok alanda kullanılabilir. REST API, verileri standart bir şekilde paylaşarak, farklı sistemlerin birbiriyle kolayca
 iletişim kurmasına olanak tanır.

Soru 6: Bir http requesti hangi bölümlerden oluşur ve bunların detayları nedir? Örnek bir http requestini JSON formatında gösteriniz?

Request Line: Bir HTTP isteği için “Request Line” şu anlama gelir: İstek metodu, istenen kaynağın URL adresi ve HTTP sürümünü içeren bir satırdır. Örneğin, GET /index.html HTTP/1.1 bir istek satırıdır.
İstek metodu, sunucuya ne yapmak istediğini belirtir. GET, POST, PUT, DELETE, PATCH gibi farklı istek metodları vardır. İstenen kaynağın URL adresi, sunucudaki kaynağın konumunu gösterir.
HTTP sürümü, istemcinin kullandığı HTTP protokolünün sürümünü belirtir

Response Headers: Sunucunun, istemcinin isteğine göre gönderdiği mesajın başında yer alan bir veya daha fazla satırdır. Response headerlar, sunucunun durumunu, yanıtın içeriğini, yanıtın boyutunu,
yanıtın süresini, yanıtın güvenliğini ve diğer bilgileri içerir. Her header, bir isim ve bir değerden oluşur. Headerlar arasında boşluk bırakılır. Headerların sonunda boş bir satır olur.
Örneğin, Content-Type: text/html bir response headerıdır. Content-Type headerı, yanıtın gövdesindeki verinin türünü belirtir.

Response Message Body: Sunucunun, istemcinin isteğine göre gönderdiği mesajın gövdesindeki verilerdir. Response message body, istenen kaynağın içeriğini, sunucunun durumunu veya hata mesajını içerebilir.
Response message body, response headerlardan sonra boş bir satır ile ayrılır. Response message body, JSON, XML, HTML, YAML gibi farklı formatlarda olabilir.
Response message body, istemcinin sunucudan aldığı verileri işlemesine ve web uygulamalarının çalışmasına olanak tanır.

JSON formatında bir http request:

POST /genapp/customers/
Host: www.example.com
Content-Type: application/json
Content-Length: nn  1  //

{
   "customers":
  {
    "firstName": "Joe”,
    "lastName": “Bloggs”,
    "fullAddress":  {
        "streetAddress": "21 2nd Street",
        "city": "New York",
        "state": "NY",
        "postalCode": 10021
    }
  }
}

Soru 7: spring beani ne demektir? Spring framework bean yapısı nedir?

Cevap: Spring bean, Spring Framework tarafından yönetilen ve oluşturulan bir nesnedir. Spring beani, Spring uygulamalarının temel yapı taşlarıdır ve genellikle bağımlılık enjeksiyonuyla konfigüre edilir.
Spring beani, uygulamanın farklı katmanlarını, bileşenlerini ve işlevlerini temsil eder. Spring beani, XML veya Java tabanlı yapılandırma dosyalarıyla tanımlanır ve bağımlılıkları Spring Container tarafından
otomatik olarak çözülür. Spring bean, uygulama geliştirme sürecini kolaylaştırır, performansı artırır, güvenliği sağlar ve ölçeklenebilirliği destekler. Spring bean, herhangi bir framework’e veya başka bir
sınıfa bağımlılığı olmayan, bünyesinde instance variable, constructor, getter, setter ve toString gibi metodları barındırabilen en temel objedir.
Spring framework bean yapısı, Spring Container adı verilen bir bileşen tarafından oluşturulan ve yönetilen nesnelerden oluşur. Bu nesnelere Spring beanleri denir. Spring beanleri, uygulamanın farklı katmanlarını,
bileşenlerini ve işlevlerini temsil eder. Spring beanleri, XML veya Java tabanlı yapılandırma dosyalarıyla tanımlanır ve bağımlılıkları Spring Container tarafından otomatik olarak çözülür.
Spring Container, Spring beanlerinin yaşam döngüsünü kontrol eder, bağımlılıklarını enjekte eder, yapılandırma ayarlarını uygular ve gerektiğinde beanleri yok eder. Spring Container, iki türden biri olabilir:
BeanFactory veya ApplicationContext. BeanFactory, en basit ve en hafif Spring Container’dır. BeanFactory, beanleri tembel bir şekilde yükler, yani sadece ihtiyaç duyulduğunda oluşturur.
BeanFactory, basit uygulamalar için yeterlidir, ancak gelişmiş özellikleri desteklemez. ApplicationContext, BeanFactory’nin bir alt sınıfıdır ve daha gelişmiş bir Spring Container’dır.
ApplicationContext, beanleri önceden yükler, yani uygulama başladığında oluşturur. ApplicationContext, olay yayınlama, uluslararasılaştırma, AOP desteği, veri erişimi entegrasyonu gibi özellikleri sayesinde
BeanFactory’den daha fazla özellik sunar.

Soru 8: JAVA Spring anotasyonu ne demektir? Aşağıda verilen örnek  anotasyonların ne işe yaradığını yazınız ve Hangilerinin spring anotasyonu hangilerinin başka kütüphane anotasyonu olduğunu belirtiniz.

(@Entity - @Id - @JsonIgnore - @NoArgsConstructor - @Getter - @Data)

Cevap: Java spring anotasyonu, Java Spring Framework içinde kullanılan bir yöntemdir. Java spring anotasyonu, bir sınıf, metod, değişken veya parametreye ek bilgi vermek için kullanılır.
Java spring anotasyonu, Spring Container tarafından tanınır ve uygulamanın yapılandırılması, bağımlılık enjeksiyonu, veri erişimi, güvenlik, web servisleri gibi işlemleri kolaylaştırır.
Java spring anotasyonu, @ işareti ile başlar ve bir isimden oluşur.

@Entity: Bir Spring anotasyonudur. Bir sınıfı, bir veritabanı tablosuyla eşleştirmek için kullanılır. Bu anotasyon, sınıfın bir JPA (Java Persistence API) varlığı olduğunu belirtir.
         Bu sayede, sınıfın özellikleri, veritabanındaki sütunlara otomatik olarak bağlanır.

@Id: Bir Spring anotasyonudur. Bir sınıfın bir özelliğini, veritabanı tablosundaki birincil anahtar olarak işaretlemek için kullanılır.
     Bu anotasyon, veri tabanı işlemlerinde, sınıfın eşsiz bir kimliğe sahip olduğunu belirtir.

@JsonIgnore: Jackson kütüphanesine ait bir anotasyondur. Bir sınıfın bir özelliğinin, JSON formatına dönüştürülürken atlanmasını sağlamak için kullanılır.
             Bu anotasyon, istenmeyen veya hassas verilerin JSON çıktısında görünmesini engeller.

@NoArgsConstructor: Lombok kütüphanesine ait bir anotasyondur. Bir sınıf için, parametresiz bir kurucu metod oluşturmak için kullanılır. Bu anotasyon, sınıfın özelliklerinin varsayılan değerlerle başlatılmasını sağlar.

@Getter: Lombok kütüphanesine ait bir anotasyondur. Bir sınıfın tüm özellikleri için, getter metodları oluşturmak için kullanılır.
         Getter metodları, sınıfın özelliklerine erişmek için kullanılan metodlardır. Bu anotasyon, kod tekrarını azaltır ve okunabilirliği artırır.
@Data: Lombok kütüphanesine ait bir anotasyondur. Bir sınıf için, @Getter, @Setter, @ToString, @EqualsAndHashCode ve @RequiredArgsConstructor gibi anotasyonları bir arada uygulamak için kullanılır.
        Bu anotasyon, sınıfın temel işlevlerini sağlar ve kodu kısaltır.

Soru 9: Sıralama algoritmaları belirtiniz. Neden bu kadar çok sıralama algoritması var?

Cevap: Sıralama algoritması, verilen bir listenin elemanlarını belirli bir sıraya sokan bir algoritmadır. Sıralama algoritmaları, verilerin düzenlenmesini, arama ve birleştirme gibi işlemlerin daha hızlı yapılmasını,
verilerin daha kolay anlaşılmasını sağlar. Sıralama algoritmalarının bu kadar çok olmasının nedeni, farklı veri tipleri, veri miktarları, veri dağılımları, performans ve bellek gereksinimleri gibi faktörlere
bağlı olarak, en uygun algoritmayı seçebilmektir. Her algoritmanın avantajları ve dezavantajları vardır ve her durum için en uygun algoritma diye bir durum yoktur.

•   Seçmeli Sıralama (Selection Sort): Bu algoritma, dizideki en küçük elemanı bulup, baştaki elemanla yer değiştirir. Sonra aynı işlemi ikinci en küçük eleman için yapar. Bu şekilde diziyi sıralar.
•	Eklemeli Sıralama (Insertion Sort): Bu algoritma, diziyi sıralı ve sırasız iki alt diziye böler. Sırasız alt diziden bir eleman alır ve sıralı alt dizide uygun yerine ekler. Bu şekilde diziyi sıralar.
•	Kabuk Sıralaması (Shell Sort): Diziyi belirli bir aralıkla seçilen elemanlardan oluşan alt dizilere böler. Her alt diziyi eklemeli sıralama ile sıralar. Sonra aralığı azaltır ve tekrarlar. Aralık 1 olduğunda, dizinin tamamı sıralanmış olur.
•	Birleştirmeli Sıralama (Merge Sort): Bu algoritma, diziyi iki eşit parçaya bölerek, her parçayı ayrı ayrı sıralar. Sonra sıralanmış iki parçayı birleştirerek tek bir sıralanmış dizi oluşturur.
•	Hızlı Sıralama (Quick Sort): Bu algoritma, diziyi bir pivot eleman etrafında ikiye bölerek, pivot elemandan küçük olanları sol tarafa, büyük olanları sağ tarafa yerleştirir. Sonra aynı işlemi sol ve sağ alt diziler için tekrarlar.
•	Kabarcık Sıralaması (Bubble Sort): Bu algoritma, dizideki bitişik elemanları karşılaştırarak, büyük olanı sağa doğru kaydırır. Bu şekilde dizinin en büyük elemanı en sağa gelir. Sonra aynı işlemi dizinin geri kalanı için yapar. Bu şekilde diziyi sıralar.

*/


