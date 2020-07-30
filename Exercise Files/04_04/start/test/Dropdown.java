import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/didiortiz/Documents/automation/LinkedinCourses/Ex_Files_Selenium_EssT/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        try {
            WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
            dropDownMenu.click();

            Thread.sleep(1000);

            WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
            autocompleteItem.click();
            Thread.sleep(1000);

//            WebDriverWait wait = new WebDriverWait(driver, 20);
//            WebElement autocompleteItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='/dropdown']")));
//            autocompleteItem.click();

            Thread.sleep(1000);
        }

        catch (TimeoutException e){
            System.out.println(e.getMessage());

        }

        driver.quit();
    }
}
