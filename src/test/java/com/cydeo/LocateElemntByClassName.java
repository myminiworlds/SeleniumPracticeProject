package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElemntByClassName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to https://app.vytrack.com/user/login
        driver.get("https://app.vytrack.com/user/login");
        // Enter username provied : "abcd"
        WebElement username=driver.findElement(By.id("prependedInput"));
        username.sendKeys("abcd");
        // Enter pasword provied :  "abcd";
    WebElement password=driver.findElement(By.id("prependedInput2"));
    password.sendKeys("abcd");
        //Click on login button
        WebElement loginBtn=driver.findElement(By.id("_submit"));
        loginBtn.click();
        //Verify the message  "Invalid user name or pasword"
        WebElement alert=driver.findElement(By.className("alert"));
        if(alert.getText().equals("Invalid user name or pasword")){
            System.out.println("Message is passed");
        }else{
            System.out.println("Message is failed");
        }
        // Verify URL contains "vytrack"
        String actualURL=driver.getCurrentUrl();
     if(actualURL.contains("vytrack")){
         System.out.println("URL is passed");
     }else{
         System.out.println("URL is failed");
     }
        //click "Forgot your pasword link"
        driver.findElement(By.partialLinkText("Forgot")).click();
        // verify title is "Forgot Password"
    if(driver.getTitle().equals("Forgot Password")){
        System.out.println("Title is correct");
    }else{
        System.out.println("Title is not correct");
    }



    }
}
