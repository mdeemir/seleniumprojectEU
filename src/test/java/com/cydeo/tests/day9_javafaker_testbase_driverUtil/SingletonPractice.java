package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test (priority = 2)
    public void singleton_understand_test1(){

        String str1 = Singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2 = Singleton.getWord();
        System.out.println("str2 = " + str2);

        String str3 = Singleton.getWord();
        System.out.println("str3 = " + str3);

    }

    @Test (priority = 1) //ÖNCE BU TEST YAPILACAK STR 4 ATANACAK SONRA STR1-2-3 E ATANMAYACAK
    public void singleton_understanding_test2(){
        String str4 = Singleton.getWord();
        System.out.println("str4 = " + str4);
    }

}
