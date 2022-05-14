package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PO1_BasicNavigation {
    public static void main(String[] args) {
    //Set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
       // navigate.to(url)  (daha fazla metodu ve optionu var)(driver.get() ayni gibi aslinda)
        driver.navigate().to("https://www.google.com");

       //driver.get(url)
       // driver.get("https://www.google.com");

        // navigate.back(url)
        driver.navigate().back();//google bos bir sayfa verdi
        //  navigate.forward();
        driver.navigate().forward();
        //  navigate.refresh();
        driver.navigate().refresh();

    }
}
