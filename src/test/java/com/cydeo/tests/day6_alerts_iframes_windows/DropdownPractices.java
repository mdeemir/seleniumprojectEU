package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    public WebDriver driver; // DİĞER METODLAR DA BULLANABİLSİN DİYE  DRİVER NESNESİNİ  EN DIŞA YAZDIK

    @BeforeMethod //HER METODTAN ÖNCE TEKRAR ETMESİNİ İSTİYORUM. BU NEDENLE TESTNG NİN BİZE SAĞLADIĞI BEFOREMETHOD METODUNU KULLANDIK
    public void setupMethod(){
        //2. Go to https://practice.cydeo.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void dropdown_task5() throws InterruptedException {
        //TC #5: Selecting state from State dropdown and verifying result 1. Open Chrome browse

        //we located the dropdown and it is ready to use
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
/*
ELEMENT LOCATE İ AYRI SATIRDA DA YAPABİLİRSİN AMA SATIRDA NESNE TANIMLARKEN YAPMAMIZ DAHA İYİ
 */
        //3. Select Illinois    ILLINOİS SECENEĞİNİ SECTİK
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois"); // HTML DE TEXT (DİKKAT VALUE DEĞİL)  NASILSA ONU KOPYALA YAPIŞTIR

        //4. Select Virginia VİRGİNİA SECENEĞİNİ SECTİK
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");// HTML DE VALUE (DİKKAT TEXT DEĞİL)  NASILSA ONU KOPYALA YAPIŞTIR

        //5. Select California CALİFORNİA SECENEĞİNİ SECTİK
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);// CALİFORNİANIN İNDEX NUMARASINI YAZDIK. DİKKAT İNDEX 0 DAN BAŞLIYOR. 6. SIRADA CALİFORNİA

        //6. Verify final selected option is California. //SIRA KARŞILAŞTIRMADA
        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();
//String actualOptionText = stateDropdown.getFirstSelectedOption() BÖYLE YAZARSAN RETURN TYPE UYUŞMADIĞI İÇİN HATA VERİR
        //ÇÜNKÜ stateDropdown.getFirstSelectedOption() BU METOD WEB ELEMENT DÖNDÜRÜR. STRİRNG TANIMLADIK
        //getFirstSelectedOption() BU METOD O ANDA SEÇİLEN ELEMENTİN OPTİONUNUN GETİRİR İSMİNE TAKILMA
        Assert.assertEquals(actualOptionText, expectedOptionText);
    }

    @Test //AYNI CLASS TA İSTEDİĞİMİZ KADAR TEST OLUŞTURABİLİRİZ. TESTNG NİN AVANTAJI
    public void dropdown_task6(){
        //Select “December 1 , 1923” and verify it is selected.
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
// XPATH KULLANARAK DYNAMİC WEB ELEMENTİB YERİNİ TANIMLADIK.
        
        //Select year using : visible text
        yearDropdown.selectByVisibleText("1923");

        //Select month using : value attribute
        monthDropdown.selectByValue("11");

        //Select day using : index number
        dayDropdown.selectByIndex(0);

        //creating expected values
        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";

        //getting actual values from browser
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        //create assertions
        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualDay, expectedDay);

    }

    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }

}
