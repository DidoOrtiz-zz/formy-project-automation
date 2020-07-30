import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
    public static void submitForm(WebDriver driver)
    {
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
    }
}
