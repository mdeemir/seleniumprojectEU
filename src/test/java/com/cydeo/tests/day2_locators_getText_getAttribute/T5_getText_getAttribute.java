package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {

    public static void main(String[] args) {

        //TC #5: getText() and getAttribute() method practice
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        WebElement headerText = driver.findElement(By.tagName("h2"));
        //Expected: Registration form
        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText(); // will return "Registration form" as String

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text verification PASSED!");
        }else{
            System.out.println("Header text verification FAILED!!!");
        }

        //4- Locate “First name” input box
        // we are locating the web element using "name" locator
        // name attribute has "firstname" value
        //WebElement firstNameInput = driver.findElement(By.name("firstname"));
        WebElement firstNameInput = driver.findElement(By.className("form-control"));
// WebElement firstNameInput = driver.findElement(By.name("first name")); yazabilirdik. burada elementi seciyoruz belirliyoruz önce
// BURADAKİ NAME İSE KUTUCUGUN SOLUNDAKİ SABİT FİRST NAME YAZAN YER
        //5- Verify placeholder attribute’s value is as expected:
        // Expected: first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");
//PLACE HOLDER KUTUCUK İÇİNDE YAZAN KISIM BİŞEY YAZINCA KAYBOLAN
        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Placeholder text verification PASSED!");
        }else{
            System.out.println("Placeholder text verification FAILED!!!");
        }

        driver.close();//EN SON BROWSERI KAPATIR

    }

}
