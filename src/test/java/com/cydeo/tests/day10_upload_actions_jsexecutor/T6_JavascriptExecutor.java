package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavascriptExecutor {

    @Test
    public void javascript_executor_test1(){
        //TC #6: Scroll using JavascriptExecutor
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        //((JavascriptExecutor)Driver.getDriver()).executeScript("");  ---> bu şekilde de doğrudan java script metodlarına ulaşabilirsin

        //3- Use below JavaScript method and scroll
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//cast yaptık . screenhotta imlplement extends görüntüü var selenium un
        //a. 750 pixels down 10 times.
        for (int i = 0; i < 10; i++) {
           BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,750)");
        }


        //b. 750 pixels up 10 times
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-750)");
            /* (+ veya -) olması x y grafiği sağ sol veya aşağı yukarı hareket.,
             ilki sağ sol, ikincirakam yukarı aşağı. y de + aşağı - yukarı, x de +sağa - sola
             */
        }

        //JavaScript method to use : window.scrollBy(0,0)
    }
}
