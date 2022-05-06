package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//nesne oluşturduktan sonra bunlar otomatik yüklenit import
public class T3_GoogleSearch {

    public static void main(String[] args) {
        //TC#3: Google search
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://www.google.com");

        //3- Write “apple” in search box
        //4- PRESS ENTER using Keys.ENTER
        WebElement googleSearchBox = driver.findElement(By.name("q"));// q GOOLE SAYFASINDAN ALDIK NAME YE BAKTIK
        googleSearchBox.sendKeys("apple" + Keys.ENTER);
        //önce apple yazdık sonra enter e bastık. kullanıcı gibi düşün herzaman. KEYS KEYBOARD DEMEK
        ///KULLANICI WEB BROWSERDA NE YAPIYORSA SELENİUM SANA O İMKANI SUNAR

        //5- Verify title:
        //Expected: Title should start with “apple” word
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        //BREAK 1.57CST
        //BREAK 2.57EST

    }


}
