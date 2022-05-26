package com.cydeo.tests.day8_properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_test() throws IOException { // PROPERTİES.LOAD(FİLE YAZINCA CIKAN EXCEPTİONNU KALDIRMAK İÇİN EXCEPTON EKLENDİ
        //1- Create the object of Properties
        Properties properties = new Properties();

        //2- We need to open the file in java memory: FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");

        //3- Load the properties object using FileInputStream object
        properties.load(file);

        //4- Use "properties" object to read value

        System.out.println("properties.getProperty(\"browser\") = "
                + properties.getProperty("browser")); // ANAHTAR BROWSER
        System.out.println("properties.getProperty(\"env\") = "
                + properties.getProperty("env")); //ANAHAR ENV
        System.out.println("properties.getProperty(\"username\") = "
                + properties.getProperty("username"));//USERNAM YAZARSAN NULL DEĞERİ GÖSTERİR

    }

}
