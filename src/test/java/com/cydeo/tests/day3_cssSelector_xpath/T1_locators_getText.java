package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {

    public static void main(String[] args) {
        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a Chrome browser
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
                //UTİLİTY DEN GETDRİVER METODU NU KULLANDIK. HIZLI DEĞİŞTİRMEK İÇİN CHROME YERİNE FİREFOZ YAZ BROWSER DEĞİŞİR
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        //driver.findElement(By.className("login-inp")).sendKeys("incorrect");
        WebElement inputUsername = driver.findElement(By.className("login-inp"));// ilk bulduğu login-in nin olduğu elementi getirir
        inputUsername.sendKeys("incorrect");//tekrar kullanabilmek için değişken oluşturduk  inputUsername

        //4- Enter incorrect password: “incorrect”
        //To auto generate local variable
        //Mac: option + enter
        //Windows: alt + enter
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");//tekrar kullanabilmek için değişken oluşturduk  inputPassword

        //5- Click to log in button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));//tekrar kullanabilmek için değişken oluşturduk loginButton
        loginButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();//errorMessage WEB ELEMENT .GETTEXT() İLE STRİNG E ÇEVİRDİK.

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification PASSED!");
        }else{
            System.out.println("Error message verification FAILED!!!");
        }

    }

}
