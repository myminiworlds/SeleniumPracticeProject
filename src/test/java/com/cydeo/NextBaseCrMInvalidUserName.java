package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextBaseCrMInvalidUserName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login2.nextbasecrm.com/");

        WebElement userName=driver.findElement(By.name("USER_LOGIN"));
        userName.sendKeys("");

        WebElement password= driver.findElement(By.name("USER_PASSWORD"));
       password.sendKeys("");

       WebElement loginBtn=driver.findElement(By.className("login-btn"));
        loginBtn.click();

        WebElement error= driver.findElement(By.className("errortext"));

        if(error.getText().equals("Incorrect login or password")){
            System.out.println("Empty user name and password error message test passed ");
        }else{
            System.out.println("Empty user name and password error message test failed");
        }

        driver.quit();




}}
