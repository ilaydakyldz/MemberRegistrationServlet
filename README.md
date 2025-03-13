# Servlet Üye Kayıt Formu

Bu proje, Java Servlet teknolojisi kullanılarak geliştirilmiş basit bir üye kayıt formu uygulamasıdır.

## Proje Özellikleri

- HTML ve Servlet tabanlı üye kayıt formu
- Form alanları:
  - Ad
  - Soyad
  - Yaşadığınız Şehir (açılır liste)
  - E-posta Adresi
  - Şifre
  - Şifre Tekrar
- Form verilerinin başka bir servlet tarafından plain text olarak görüntülenmesi
- Temel form doğrulama işlemleri

## Kurulum

1. Bu projeyi bilgisayarınıza klonlayın:

        git clone https://github.com/alierenozgenn/MemberRegistrationServlet.git

2. Projeyi bir Java EE destekleyen IDE'de açın (Eclipse, IntelliJ IDEA, NetBeans vb.)

3. Apache Tomcat veya başka bir servlet container yüklü olduğundan emin olun

4. Projeyi derleyin ve servlet container üzerinde çalıştırın

## Kullanım

1. Tarayıcınızda `http://localhost:8080/RegisterFrom/` adresine gidin
2. Formu doldurun ve "Kaydet" butonuna tıklayın
3. Girilen bilgiler başka bir sayfada plain text olarak görüntülenecektir

## Proje Yapısı

        src/
        ├── main/
        │   ├── java/
        │   │   ├── com/
        │   │   │   ├── kayitformu/
        │   │   │   │   ├── KayitFormuServlet.java
        │   │   │   │   └── KayitSonucServlet.java
        │   ├── webapp/
        │   │   ├── WEB-INF/
        │   │   │   └── web.xml
        │   │   └── index.html


## Teknolojiler

- Java Servlet API
- HTML
- CSS (Temel stil)
- Apache Tomcat

## Lisans

Bu proje [MIT Lisansı](LICENSE) altında lisanslanmıştır.
