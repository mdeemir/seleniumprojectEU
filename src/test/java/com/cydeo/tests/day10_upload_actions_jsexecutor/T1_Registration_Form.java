package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void registration_form_test(){
        //1. Open browser
        //2. Go to website:https://practice.cydeo.com/registration_form
        //Driver.getDriver() --> driver
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //Create JavaFaker object
        Faker faker = new Faker();//rastgele veri oluşturmak için

        //3. Enter first name
        //WebElement inputFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        // //input[@name  turuncuya döndü screenshotta var settings-plugin-selenium ui yükledik
        //Driver.getDriver()--> bunu kullancan artık sana driver ı getirecek
        String fakerFirstName = faker.name().firstName();//BÖYLE DE YAZABİLİRSİN faker.name().firstName() BU STRİNG DÖNDÜRÜR
        inputFirstName.sendKeys(fakerFirstName);//() PARANTEZ İÇİNE STRİNG YAZMALISIN

        //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        //CTRL+D KOPYAŞA VE CTRL+D İLE AĞAŞI TAŞI NAME İ DEĞİŞTİR KISAYOL
        inputLastName.sendKeys(faker.name().lastName());

        //5. Enter username
        //inputUsername.sendKeys(faker.name().username().replaceAll(".", ""));---> RASTGELE DATADA . VARSA "" İLE DEĞİŞTİR
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));

        String user = faker.bothify("helpdesk###");//### DEĞİŞTİRECEK HERSEFERİNDE DEĞİŞTİRECEK
        inputUsername.sendKeys(user);

        //6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user + "@email.com");//RATGELE OLUŞTURDUĞUMUZ helpdesk###@EMAİL.COM YAPTIK

        //7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.numerify("########"));//8 KARAKTERLİ RASTGELE ŞİFRE OLUŞTURDU
        //System.out.println("faker.internet().password() = " + faker.internet().password());

        //8. Enter phone number
        WebElement inputPhone = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys(faker.numerify("###-###-####"));

        //9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();//kadın seceneğini seçip tıkladık

        //10.Enter date of birth
        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //faker.number().numberBetween(2004, 1920)--> FAKER DA BELLİ SAYI ARASINDA SAYI ÜRETİR.
        inputBirthday.sendKeys("03/08/2000");

        //11.Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));
        // DROPDOWN ALTINDAKİ ECENEKLERDEN HERHANGİ BİRİNİ SECECEK HER ZAMAN. 9 SECENEK VAR İNDEX NO 1-9 ARASI (SIFIR VAR AMA ONA GEREK YOKTU)
        //break until 1.05pm cst

        //12.Select Job Title
        //13.Select programming language from checkboxes
        //14.Click to sign up button
        //15.Verify success message “You’ve successfully completed registration.” is
        //displayed.
    }
}
