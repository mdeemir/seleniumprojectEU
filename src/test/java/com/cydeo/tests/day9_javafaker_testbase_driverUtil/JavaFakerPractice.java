package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {
//TEST DATASI OLUŞTURMAK İÇİN KULLANIYORUZ. JAVA FAKER BİZE RASTGELE TEST DATASI SAĞLIYOR.İHTİYSÇ OLDUĞUNDA KULLANIYORUZ
    @Test
    public void test1(){
        //Creating Faker object to reach methods
        Faker faker = new Faker();
        //Faker faker = new Faker(new Locale("fr")); ---> LOCALE  ÜLKEYE GÖRE BAZI TEST DATALARINI OLUŞTURYOR ADRES VB.

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        //HER YÜRÜTMEDE FARKLI İSİM YAZDIRIYOR RASTGELE
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        //HER YÜRÜTMEDE FARKLI SOY İSİM YAZDIRIYOR RASTGELE
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        //HER YÜRÜTMEDE FARKLI AD-SOYAD YAZDIRIYOR RASTGELE

        //numerify() method will generate random numbers in the format we want to get
        //RASTGELE İSTEDİĞİMİZ FORMATTA NUMARA OLUŞTURDU
        System.out.println("faker.numerify(\"###-###-####\") = "
                + faker.numerify("###-###-####"));

        System.out.println("faker.numerify(\"312-###-####\") = "
                + faker.numerify("312-###-####"));

        //letterify() method will return random letters where we pass "?"
        //İSTEDİĞİMİZ YAZIYI RASTGELE OLUŞTURUYOR. ? İŞARETİ KULLANARAK
        System.out.println("faker.letterify(\"???-????\") = "
                + faker.letterify("???-????"));
        //HARF VE RAKAN İÇEREN DATA PLUŞTURUYOR
        System.out.println("faker.bothify(\"##?#-##?#-#?#?#-##??\") = "
                + faker.bothify("##?#-##?#-#?#?#-##??"));

        System.out.println("faker.finance().creditCard() = "
                + faker.finance().creditCard().replaceAll("-", ""));
        //STR,NG DEĞER DÖNDÜRDÜĞÜ İÇİN STİRİNG METODLARINI KULLANABİLİRSİN. CHUCK MORRİS YERİNE MUHTAR YAZDIK :)
        System.out.println("faker.chuckNorris().fact() = "
                + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));



    }
}
