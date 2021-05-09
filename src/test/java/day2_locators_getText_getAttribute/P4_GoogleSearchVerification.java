package day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        //<-write apple in the search box->         <-hit enter->
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        // verify title
        // Expected: Title should start with "apple" word
        String expectedInTitle ="apple";
        String actualTitle = driver.getTitle();
        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
        System.out.println("Title verification FAILED!");}

    }
}
