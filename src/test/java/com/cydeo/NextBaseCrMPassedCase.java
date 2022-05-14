package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextBaseCrMPassedCase {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login2.nextbasecrm.com/");
        WebElement userName=driver.findElement(By.name("USER_LOGIN"));
        userName.sendKeys("helpdesk1@cybertekschool.com");
        WebElement password= driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");
        WebElement loginBtn=driver.findElement(By.className("login-btn"));
        loginBtn.click();
        if(driver.getTitle().equals("Portal")){
            System.out.println("Login successful");
        }else{
            System.out.println("Login Failed");
        }
        driver.quit();
    }
}
