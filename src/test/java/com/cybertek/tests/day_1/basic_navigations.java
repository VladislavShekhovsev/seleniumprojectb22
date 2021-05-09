package com.cybertek.tests.day_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_navigations {
    public static void main(String[] args) throws InterruptedException {
        //1)-set-up the browser driver
        WebDriverManager.chromedriver().setup();
        //2)- create instance of selenium web driver
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.tesla.com");
        //putting 3 seconds off sleep to delay the go back
        Thread.sleep(3000);
        //going back using navigation
        driver.navigate().back();
        // going forward using navigation
        Thread.sleep(3000);
        driver.navigate().forward();
        // refreshing the page using navigation
        Thread.sleep(3000);
        driver.navigate().refresh();
        // going to some other website using navigation
        driver.navigate().to("http://www.google.com");
        // provide the title of the web page and return Sting title
        System.out.println("current title "+driver.getTitle());
    }
}
