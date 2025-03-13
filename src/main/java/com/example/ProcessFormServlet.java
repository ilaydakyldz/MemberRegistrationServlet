package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessFormServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Önce karakter kodlamasını ayarla - bu çok önemli, verileri okumadan önce yapılmalı
        request.setCharacterEncoding("UTF-8");
        
        // Form verilerini al
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String city = request.getParameter("city");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        
        // Yanıt karakter kodlamasını ayarla
        response.setContentType("text/plain;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        // Plain text olarak çıktı veriyoruz - ödev şartını karşılamak için
        try (PrintWriter out = response.getWriter()) {
            out.println("ÜYE KAYIT BİLGİLERİ");
            out.println("===================");
            out.println("");
            out.println("Ad: " + firstname);
            out.println("Soyad: " + lastname);
            out.println("Şehir: " + city);
            out.println("E-posta: " + email);
            out.println("Şifre: " + password);
            out.println("Şifre Tekrar: " + confirmPassword);
            
            // Şifre kontrolü
            if (!password.equals(confirmPassword)) {
                out.println("");
                out.println("HATA: Şifreler eşleşmiyor!");
            } else {
                out.println("");
                out.println("Kayıt işlemi başarılı!");
            }
        }
    }
}