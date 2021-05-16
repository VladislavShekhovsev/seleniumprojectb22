package com.cybertek.tests.day_2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");
        Thread.sleep(5000);
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl ="cybertekschool";
        if(driver.getCurrentUrl().contains(expectedUrl)){
            System.out.println("URL verification PASSED");
        }else{
            System.out.println("URL verification FAILED");
        }
        System.out.println("current url "+currentUrl);
        System.out.println("current title "+driver.getTitle());
        driver.close();
    }
}
