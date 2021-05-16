package com.cybertek.tests.day_3_seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekPractice_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //Expected: Web Orders Login
         String expectedTitle = "Web Orders Login";
         String actualTitle=driver.getTitle();
         if(actualTitle.equals(expectedTitle)){
             System.out.println("Verification completed, Title is correct ");
         }else{System.out.println("Verification completed, Title is incorrect ");}
         WebElement loginUsername = driver.findElement(By.name("ctl00$MainContent$username"));
         loginUsername.sendKeys("Tester");
         Thread.sleep(4000);
         WebElement loginPassword = driver.findElement(By.name("ctl00$MainContent$password"));
         loginPassword.sendKeys("test");
         Thread.sleep(4000);
         WebElement buttonSubmit = driver.findElement(By.name("ctl00$MainContent$login_button"));
         buttonSubmit.click();
         String expectedHomePageTitle="Web Orders";
         String actualTitleOnPAge =driver.getTitle();
         if(expectedHomePageTitle.equals(actualTitleOnPAge)){
             System.out.println("Verification completed, Title is correct");
         }else{
             System.out.println("Verification completed, Title is incorrect ");
         }
         Thread.sleep(10000);
         driver.close();


    }
}
