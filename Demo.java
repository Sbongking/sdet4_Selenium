  /*  org.openqa.selenium.WebDriver
    org.openqa.selenium.firefox.FirefoxDriver
    org.openqa.selenium.By
    org.openqa.selenium.WebElement*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
    public static void main(String[] args) {
      
        WebDriver driver = new FirefoxDriver();

      
        driver.get("https://www.google.com");
        
       
       
        
        driver.close();
    }
}