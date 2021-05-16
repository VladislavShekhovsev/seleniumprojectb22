package com.cybertek.tests.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1Facebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Verification completed, Status:PASSED!");
        }else{
            System.out.println("Verification completed, Status:FAILED!");
        }
         WebElement mail =driver.findElement(By.name("email"));
         mail.sendKeys("Vladislav13457@gmail.com");
         WebElement pass= driver.findElement(By.name("pass"));
         //alt+enter for windows to create shortcut for the name of WebDriver
         Thread.sleep(3000);
         pass.sendKeys("1loveLera"+ Keys.ENTER);
         actualTitle =driver.getTitle();
         expectedTitle ="Log into Facebook | Facebook";
         if(expectedTitle.equals(actualTitle)){
             System.out.println("Verification step 2 completed, Status:PASSED!");
         }else{System.out.println("Verification step 2 completed, Status:FAILED!");}
        System.out.println("Title incorrect, need to add | Facebook");
         //driver.close();
    }
}
