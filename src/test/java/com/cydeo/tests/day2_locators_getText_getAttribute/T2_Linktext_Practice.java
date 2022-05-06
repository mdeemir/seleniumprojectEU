package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Linktext_Practice {

    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a Chrome browser--> BU ADINLAR ORTAK OLDUĞU İÇİN KOPYALA YAPIŞTI YAPABİLİRSİN
        WebDriverManager.chromedriver().setup(); //AYARLARI YÜKLEDİK
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //3- Click to A/B Testing from top of the list.
        //Thread.sleep(2000);---> 2 SANİYE BEKLETTİK ÇALIŞMASINI
        /*driver.findElement(By.linkText("A/B Testing")).click();--> BU SEKİLDE TEK SATIRDA DA YAZABİLİRSİN AMA AŞAĞIDAKKİ
         GİBİ AÇIK KOD YAZMAK DAHA İYİ. ANLASILIR VE AÇIK OLDU.
         abTestLink NESNESİNİ OLUŞTURARAK SONRADAN BU NESNEYİ KULLANMA İMKANI ELDE ETTİK
        */
        /*
        findElement ve find Elements metod ları var find Element i seç. çünkü farlı return type ları var.
         */
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        //"A/ Testing"  YAZARSAN EXCEPTİON VERİR NoSuchElementException verir
        abTestLink.click();

        //4- Verify title is:
        //Expected: No A/B Test
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASS!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        //5- Go back to home page by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Practice
        expectedTitle= "Practice";
        actualTitle = driver.getTitle();//butada actualtitle ı güncelledik. yani reassing yaptık.

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        //BREAK UNTIL 1.01PM CST
        //BREAK UNTIL 2.01PM EST


    }

}
