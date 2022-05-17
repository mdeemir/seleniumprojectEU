package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @Test (priority = 1) // HANGİ TSTİN ÖNCED ÇALIŞTIRILACAĞINI PRİORİTY BELİRLER
    public void test1(){
        System.out.println("Test 1 is running...");

        //ASSERT EQUALS: compare 2 of the same things
        String actual = "apple";
        String expected = "apple";
//aynı tipte değişken olacak
        Assert.assertEquals(actual, expected);

    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("Test 2 is running...");

        //AssertTrue
        String actual = "apple";
        String expected = "apple";
//boolean değişken yazman gerekir true kullanırken
        Assert.assertTrue(actual.equals(expected), "your message will go here");

    }

    @BeforeClass // BİR KERE (BİR KERE ÇALIŞIR DİKKAT BEFORE METOD İSE HER METOD DA ÇALIŞIR BİR KERE)
    // BÜTÜN METODLARDAN ÖNCE ÇALIŞIR
    public void setupMethod(){
        System.out.println("-----> BeforeClass is running!");

    }

    @AfterClass // BİR KERE (BİR KERE ÇALIŞIR DİKKAT after METOD İSE HER METOD DA ÇALIŞIR BİR KERE)
    // BÜTÜN METODLARDAN sonra ÇALIŞIR
    public void tearDownClass(){
        System.out.println("-----> AfterClass is running!");

    }

    @BeforeMethod //HER METODDAN ÖNCE ÇALIŞIR
    public void setUpMethod(){
        System.out.println("---> BeforeMethod is running!");
    }

    @AfterMethod //HER METODDAN SONRA ÇALIŞIR
    public void tearDownMethod(){
        System.out.println("---> AfterMethod is running!");
    }

}
