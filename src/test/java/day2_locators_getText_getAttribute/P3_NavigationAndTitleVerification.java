package day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        //<--locating the web element using link text locator-->     <--clicking-->
        //driver.findElement(By.linkText("Gmail")).click();

        // like .contains in java search for some elements for example Gmail contains mail
        // very flexible and sometimes comfortable method but less secure
        driver.findElement(By.partialLinkText("mail")).click();

        //verify title contains
        //Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }
        // Ctrl +D multiply the line
        // Ctrl +shift+ arrows take the line up and down

        // going back using navigation
        driver.navigate().back();

        // verify title equals;
        //Expected: Google
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if(actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }
    }
}
