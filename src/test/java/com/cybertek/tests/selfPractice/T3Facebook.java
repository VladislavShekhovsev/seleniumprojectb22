package com.cybertek.tests.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3Facebook {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        WebElement createAPage =driver.findElement(By.className("_8esh"));
        String link = createAPage.getAttribute("href");
        String expectedKeysInLink = "registration_form";
        if(link.contains(expectedKeysInLink)){
            System.out.println("Verification completed, Status: PASSED! ");
        }else{System.out.println("Verification completed, Status: FAILED! ");}
        driver.close();
    }
}
