package day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHeaderTextVerificationPArt2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        Thread.sleep(3000);
        String expectedLinkText = "Zero Bank";
        WebElement zeroBankLink = driver.findElement(By.className("brand"));
        String actualLinkString = zeroBankLink.getText();
        if (actualLinkString.equals(expectedLinkText)) {
            System.out.println("Verification completed, status: PASSED!");
        } else {
            System.out.println("Verification completed, status: FAILED!");
        }
        String expectedAttributeValue = "index.html";
        String ActualAttribute = zeroBankLink.getAttribute("href");
        System.out.println(ActualAttribute);
        if(ActualAttribute.contains(expectedAttributeValue)){
            System.out.println("Verification completed, status: PASSED!");
        }else{System.out.println("Verification completed, status: FAILED!");}
        driver.close();
    }
}


