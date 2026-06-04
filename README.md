# 🚀 Yazılım Test Mühendisliği - API Otomasyon Regresyon Test Projesi

Bu proje, **Yazılım Test Mühendisliği** dersi dönem sonu projesi kapsamında; Rest Assured kütüphanesi kullanılarak belirlenen servis uç noktalarına yönelik otomatik regresyon testlerinin koşturulması ve doğrulanması amacıyla geliştirilmiştir.

## 🛠️ Kullanılan Teknolojiler
- **Programlama Dili:** Java (JavaSE-25 LTS)
- **Derleme ve Bağımlılık Yönetimi:** Maven
- **Test Framework:** JUnit 5
- **API Test Kütüphanesi:** Rest Assured

## 📌 Test Edilen Senaryolar ve Kontroller
Ödev isterlerine uygun olarak geliştirilen test senaryoları (GitHub REST API mimarisi üzerinde) şu kontrolleri gerçekleştirmektedir:
1. **Status Code Kontrolü:** İsteklerin başarı durum kodları (200 OK, 404 Not Found vb.) doğrulanmaktadır.
2. **Response Body Doğrulaması:** Dönen JSON içeriğindeki verilerin doğruluğu ve beklenen anahtar alanların (`name`, `private` vb.) varlığı kontrol edilmektedir.
3. **Süre Kontrolü (Performance Assertion):** API servisinin belirlenen milisaniye sınırının altında yanıt verip vermediği performans kriteri olarak test edilmektedir.

## 📂 Ödev İçeriği
- `src/test/java` klasörü hiyerarşisi içerisinde Rest Assured ile yazılmış otomasyon regresyon test kodları yer almaktadır.
- Projenin ana dizininde **"Yapay Zeka Destekli Yazılım Test Mühendisliği"** konulu ödev sunum dosyası (PDF) bulunmaktadır.

## 🏃‍♂️ Projeyi Çalıştırma
Projeyi yerelde test etmek ve regresyon testlerini otomatik olarak koşturmak için terminale aşağıdaki Maven komutunu yazabilirsiniz:

```bash
mvn clean test
