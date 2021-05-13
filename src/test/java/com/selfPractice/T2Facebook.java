package com.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2Facebook {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        String actualText = driver.findElement(By.className("_8eso")).getText();
        String expectedText = "Connect with friends and the world around you on Facebook.";
        if(actualText.equals(expectedText)){
            System.out.println("verification completed, Status: PASSED! ");
        }else{System.out.println("verification completed, Status: FAILED! ");}
        driver.close();

    }
}
