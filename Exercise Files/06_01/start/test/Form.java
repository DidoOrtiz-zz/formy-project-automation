import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/didiortiz/Documents/automation/LinkedinCourses/Ex_Files_Selenium_EssT/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Diana");

        WebElement LastName = driver.findElement(By.id("last-name"));
        firstName.sendKeys("Ortiz");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("QA Lead and Automation Engineer");

        WebElement educationLevel = driver.findElement(By.cssSelector("input#radio-button-1"));
        educationLevel.click();

        WebElement sex = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        sex.click();

        WebElement yearOfExperience = driver.findElement(By.id("select-menu"));
        yearOfExperience.click();

        WebElement selectYearsItem = driver.findElement(By.cssSelector("option[value='4']"));
        selectYearsItem.click();

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("03/03/2021");


        WebElement closeDatePicker = driver.findElement(By.id("datepicker"));
        closeDatePicker.sendKeys(Keys.RETURN);

        WebElement submit = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        submit.click();

        Thread.sleep(2000);

        driver.quit();
    }
}
