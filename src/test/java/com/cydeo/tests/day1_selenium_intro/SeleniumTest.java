package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {
        //1-setting up the web driver manager
        //bonigarcia dan gelen driverin ayarlarını yüklüyoruz ilk adımda. pom.xml de dependencies de yükledik verisyon değişirse güncelliyorz
        //kaldırırsan browser driverın olmadan browser amcaya çalışıyorsun diye hata verir. browser driver olmalı
        WebDriverManager.chromedriver().setup();

        //2-create instance of the crome driver
        //seleniumdaki ilk kod chrome driverı açması için
        WebDriver driver= new ChromeDriver();

        // 3- test if driver is working as expected
        //bunu kaldırırsan boş browser sayfası açar
        //selenium kütüphanesinden gelen metod ilgili sayfayı açıyor.
        driver.get("https://www.facebook.com");
    }
}
