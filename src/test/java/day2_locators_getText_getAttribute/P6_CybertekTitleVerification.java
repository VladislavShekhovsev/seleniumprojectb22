package day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_CybertekTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/inputs");
        Thread.sleep(3000);
        driver.findElement(By.className("nav-link")).click();
        Thread.sleep(3000);
        String expectedTitle ="Practice";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verification completed, Status PASSED!");
        }else {System.out.println("Verification completed, Status FAILED!");}
        driver.close();

    }
}
