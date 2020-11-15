
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Activity_5_2 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The checkbox is selected: " + checkboxInput.isSelected());

        checkboxInput.click();

        System.out.println("The checkbox is selected: " + checkboxInput.isSelected());

        driver.close();

    }

}