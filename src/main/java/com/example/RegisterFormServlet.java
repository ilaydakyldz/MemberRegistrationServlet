package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterFormServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='tr'>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<title>Üye Kayıt Formu</title>");
            out.println("<style>");
            out.println("body {");
            out.println("    font-family: Arial, sans-serif;");
            out.println("    margin: 0;");
            out.println("    padding: 20px;");
            out.println("    display: flex;");
            out.println("    justify-content: center;");
            out.println("    background-color: #f0f0f0;");
            out.println("}");
            out.println(".container {");
            out.println("    width: 100%;");
            out.println("    max-width: 500px;");
            out.println("}");
            out.println("h1 {");
            out.println("    text-align: center;");
            out.println("    color: #333;");
            out.println("    margin-bottom: 20px;");
            out.println("}");
            out.println("form {");
            out.println("    background-color: #ffffff;");
            out.println("    padding: 25px;");
            out.println("    border-radius: 8px;");
            out.println("    box-shadow: 0 0 15px rgba(0,0,0,0.1);");
            out.println("}");
            out.println(".form-group {");
            out.println("    margin-bottom: 20px;");
            out.println("}");
            out.println("label {");
            out.println("    display: block;");
            out.println("    margin-bottom: 8px;");
            out.println("    font-weight: bold;");
            out.println("    color: #555;");
            out.println("}");
            out.println("input, select {");
            out.println("    width: 100%;");
            out.println("    padding: 10px;");
            out.println("    border: 1px solid #ddd;");
            out.println("    border-radius: 4px;");
            out.println("    box-sizing: border-box;");
            out.println("    font-size: 16px;");
            out.println("}");
            out.println("input:focus, select:focus {");
            out.println("    outline: none;");
            out.println("    border-color: #4CAF50;");
            out.println("    box-shadow: 0 0 5px rgba(76,175,80,0.3);");
            out.println("}");
            out.println("button {");
            out.println("    background-color: #4CAF50;");
            out.println("    color: white;");
            out.println("    padding: 12px 15px;");
            out.println("    border: none;");
            out.println("    border-radius: 4px;");
            out.println("    cursor: pointer;");
            out.println("    font-size: 16px;");
            out.println("    width: 100%;");
            out.println("    transition: background-color 0.3s;");
            out.println("}");
            out.println("button:hover {");
            out.println("    background-color: #45a049;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<h1>Üye Kayıt Formu</h1>");
            
            // Form
            out.println("<form action='process' method='post'>");
            
            // Ad
            out.println("<div class='form-group'>");
            out.println("<label for='firstname'>Ad:</label>");
            out.println("<input type='text' id='firstname' name='firstname' required>");
            out.println("</div>");
            
            // Soyad
            out.println("<div class='form-group'>");
            out.println("<label for='lastname'>Soyad:</label>");
            out.println("<input type='text' id='lastname' name='lastname' required>");
            out.println("</div>");
            
            // Şehir - genişletilmiş liste
            out.println("<div class='form-group'>");
            out.println("<label for='city'>Yaşadığınız Şehir:</label>");
            out.println("<select id='city' name='city' required>");
            out.println("<option value=''>Şehir Seçiniz</option>");
            out.println("<option value='Adana'>Adana</option>");
            out.println("<option value='Adıyaman'>Adıyaman</option>");
            out.println("<option value='Afyonkarahisar'>Afyonkarahisar</option>");
            out.println("<option value='Ağrı'>Ağrı</option>");
            out.println("<option value='Amasya'>Amasya</option>");
            out.println("<option value='Ankara'>Ankara</option>");
            out.println("<option value='Antalya'>Antalya</option>");
            out.println("<option value='Artvin'>Artvin</option>");
            out.println("<option value='Aydın'>Aydın</option>");
            out.println("<option value='Balıkesir'>Balıkesir</option>");
            out.println("<option value='Bilecik'>Bilecik</option>");
            out.println("<option value='Bingöl'>Bingöl</option>");
            out.println("<option value='Bitlis'>Bitlis</option>");
            out.println("<option value='Bolu'>Bolu</option>");
            out.println("<option value='Burdur'>Burdur</option>");
            out.println("<option value='Bursa'>Bursa</option>");
            out.println("<option value='Çanakkale'>Çanakkale</option>");
            out.println("<option value='Çankırı'>Çankırı</option>");
            out.println("<option value='Çorum'>Çorum</option>");
            out.println("<option value='Denizli'>Denizli</option>");
            out.println("<option value='Diyarbakır'>Diyarbakır</option>");
            out.println("<option value='Edirne'>Edirne</option>");
            out.println("<option value='Elazığ'>Elazığ</option>");
            out.println("<option value='Erzincan'>Erzincan</option>");
            out.println("<option value='Erzurum'>Erzurum</option>");
            out.println("<option value='Eskişehir'>Eskişehir</option>");
            out.println("<option value='Gaziantep'>Gaziantep</option>");
            out.println("<option value='Giresun'>Giresun</option>");
            out.println("<option value='Gümüşhane'>Gümüşhane</option>");
            out.println("<option value='Hakkari'>Hakkari</option>");
            out.println("<option value='Hatay'>Hatay</option>");
            out.println("<option value='Isparta'>Isparta</option>");
            out.println("<option value='İçel (Mersin)'>İçel (Mersin)</option>");
            out.println("<option value='İstanbul'>İstanbul</option>");
            out.println("<option value='İzmir'>İzmir</option>");
            out.println("<option value='Kars'>Kars</option>");
            out.println("<option value='Kastamonu'>Kastamonu</option>");
            out.println("<option value='Kayseri'>Kayseri</option>");
            out.println("<option value='Kırklareli'>Kırklareli</option>");
            out.println("<option value='Kırşehir'>Kırşehir</option>");
            out.println("<option value='Kocaeli'>Kocaeli</option>");
            out.println("<option value='Konya'>Konya</option>");
            out.println("<option value='Kütahya'>Kütahya</option>");
            out.println("<option value='Malatya'>Malatya</option>");
            out.println("<option value='Manisa'>Manisa</option>");
            out.println("<option value='Kahramanmaraş'>Kahramanmaraş</option>");
            out.println("<option value='Mardin'>Mardin</option>");
            out.println("<option value='Muğla'>Muğla</option>");
            out.println("<option value='Muş'>Muş</option>");
            out.println("<option value='Nevşehir'>Nevşehir</option>");
            out.println("<option value='Niğde'>Niğde</option>");
            out.println("<option value='Ordu'>Ordu</option>");
            out.println("<option value='Rize'>Rize</option>");
            out.println("<option value='Sakarya'>Sakarya</option>");
            out.println("<option value='Samsun'>Samsun</option>");
            out.println("<option value='Siirt'>Siirt</option>");
            out.println("<option value='Sinop'>Sinop</option>");
            out.println("<option value='Sivas'>Sivas</option>");
            out.println("<option value='Tekirdağ'>Tekirdağ</option>");
            out.println("<option value='Tokat'>Tokat</option>");
            out.println("<option value='Trabzon'>Trabzon</option>");
            out.println("<option value='Tunceli'>Tunceli</option>");
            out.println("<option value='Şanlıurfa'>Şanlıurfa</option>");
            out.println("<option value='Uşak'>Uşak</option>");
            out.println("<option value='Van'>Van</option>");
            out.println("<option value='Yozgat'>Yozgat</option>");
            out.println("<option value='Zonguldak'>Zonguldak</option>");
            out.println("<option value='Aksaray'>Aksaray</option>");
            out.println("<option value='Bayburt'>Bayburt</option>");
            out.println("<option value='Karaman'>Karaman</option>");
            out.println("<option value='Kırıkkale'>Kırıkkale</option>");
            out.println("<option value='Batman'>Batman</option>");
            out.println("<option value='Şırnak'>Şırnak</option>");
            out.println("<option value='Bartın'>Bartın</option>");
            out.println("<option value='Ardahan'>Ardahan</option>");
            out.println("<option value='Iğdır'>Iğdır</option>");
            out.println("<option value='Yalova'>Yalova</option>");
            out.println("<option value='Karabük'>Karabük</option>");
            out.println("<option value='Kilis'>Kilis</option>");
            out.println("<option value='Osmaniye'>Osmaniye</option>");
            out.println("<option value='Düzce'>Düzce</option>");
            out.println("</select>");
            out.println("</div>");
            
            // E-posta
            out.println("<div class='form-group'>");
            out.println("<label for='email'>E-posta Adresi:</label>");
            out.println("<input type='email' id='email' name='email' required>");
            out.println("</div>");
            
            // Şifre
            out.println("<div class='form-group'>");
            out.println("<label for='password'>Şifre:</label>");
            out.println("<input type='password' id='password' name='password' required>");
            out.println("</div>");
            
            // Şifre Tekrar
            out.println("<div class='form-group'>");
            out.println("<label for='confirmPassword'>Şifre Tekrar:</label>");
            out.println("<input type='password' id='confirmPassword' name='confirmPassword' required>");
            out.println("</div>");
            
            // Gönder Butonu
            out.println("<button type='submit'>Kayıt Ol</button>");
            
            out.println("</form>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}