package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    /*
    IN THIS CLASS WE ARE SOLVING THE DAY2_TASK1
    KOD YAZARKEN MÜMKÜN OLDUGUNCA TEMİZ KOD YAZ. DEĞİŞKNELERİ AÇIK OKUNABİLİR YAZ. KISA YAZMAKTANDA OKUNABİLİR OLSUN

     */

    public static void main(String[] args) {

        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();// kısayolları kullan yazarken çıkıyor
        WebDriver driver = new ChromeDriver();//BU AŞAMADA AYARLARIMIZI YAPTIK VE CHROME BROWSER I AÇTIK
        driver.manage().window().maximize();// PENCEREYİ FULL SCREEN YAPTIK

        //2. Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");//SİTEYİ ACTIK

        //3. Verify URL contains
        //Expected: cydeo
        String expectedURL = "cydeo"; // BEKLENEN YAZMASI GEREKEN İFADE
        String actualURL = driver.getCurrentUrl();// OANKİ URLYİ ALDIK. URL ALMAK İÇİN METOD

        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!!!");
        }

        // 4. Verify title:
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();//BAŞLIK ALMAK İÇİN METOD

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        driver.close(); // DRİVERİ KAPATTIK

        //break 15mins: 10.10am cST
        //break 15mins: 11.10am EST

    }

}
