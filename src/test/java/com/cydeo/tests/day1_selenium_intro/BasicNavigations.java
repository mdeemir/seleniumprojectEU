package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1- Set up the "browser driver"
        WebDriverManager.chromedriver().setup();
        //2- Create instance of the Selenium WebDriver
        //This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //This line will maximize the browser size
        driver.manage().window().maximize();

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");
        /*
        https:/ kaldırırsan hata verir.
        www kaldırısan çalışır
         */

        //get the title of the page  ---> tesla sayfasının başlığını aldı
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);// yazdırdık

        String currentURL =  driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //Stop code execution for 3 seconds
        Thread.sleep(3000);// 3 saniye program çalışmasını bekletiyor yoksa çok hızlı geçiyor

        // use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use navigate().to():   başka bir sayfaya geçti
        driver.navigate().to("https://www.google.com");

        //get the current title after getting the google page
        currentTitle = driver.getTitle();//get title metodu tekrar cağırdık ve değişkene tekrar atadık.
        //açılan sayfadan aldı başlığı tekrar (google dan).  html kodun içindeki title ı bulup çıkarıyor


        //System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("currentTitle = " + currentTitle);

        // Get the current URL using Selenium
        currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);


        // this will close the currently opened window
        driver.close();

        // this will close all of the opened windows
        driver.quit();



    }

    }



