import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

    public class Checkboxes {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "/Users/didiortiz/Documents/automation/LinkedinCourses/Ex_Files_Selenium_EssT/chromedriver");

            WebDriver driver = new ChromeDriver();

            driver.get("https://formy-project.herokuapp.com/checkbox");

            WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
            checkbox1.click();

            Thread.sleep(1000);

            WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
            checkbox1.click();
            checkbox2.click();

            Thread.sleep(1000);

            WebElement checkbox3 = driver.findElement(By.id("checkbox-3"));
            checkbox2.click();
            checkbox3.click();

            Thread.sleep(1000);

            driver.quit();
        }
    }
