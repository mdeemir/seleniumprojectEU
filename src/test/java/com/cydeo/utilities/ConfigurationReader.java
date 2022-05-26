package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1- Create the object of Properties
    private static Properties properties = new Properties();
    // STATİC OLMASININ SEBEBİ CLASS ÇAĞIRILINCA HERSEYDEN ÖNCE BU ÇALIŞSSIN
    // CLASS DIŞINDA ULAŞMAK İSTEMEDİĞİM İÇİN PRİVATE YAPTIK

    static{

        try {

            //2- We need to open the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //3- Load the properties object using FileInputStream object
            properties.load(file);

            //close the file
            file.close();


        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class.");
            e.printStackTrace();
        }

    }
//METODUMUZU YAZDIK
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
//CLASS DIŞINDA ULAŞILABİLİR OLMALI BU METOD  OY YÜZDEN PUBLİC

}
