package com.cybertek.tests.day_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumIntro {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriverManager.chromedriver();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
