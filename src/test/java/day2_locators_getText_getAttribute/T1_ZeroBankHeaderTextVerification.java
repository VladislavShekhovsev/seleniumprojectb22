package day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHeaderTextVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        Thread.sleep(3000);
        //Expected: “Log in to ZeroBank”
        String expectedHeader= "Log in to ZeroBank";
        String text = driver.findElement(By.tagName("h3")).getText();
        if(text.equals(expectedHeader)){
            System.out.println("Verification completed, Status PASSED!");
        }else{System.out.println("Verification completed, Status FAILED!");}
        driver.close();


    }
}
