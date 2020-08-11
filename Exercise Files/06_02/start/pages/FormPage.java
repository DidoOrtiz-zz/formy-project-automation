import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FormPage {
    public static void submitForm(WebDriver driver) throws InterruptedException {
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

 //       WebElement yearOfExperience = driver.findElement(By.id("select-menu"));
 //       yearOfExperience.click();

        //locator: Find by Id.


       Select dropDownByIndex = new Select(driver.findElement(By.id("select-menu")));

       System.out.println("List Option: "+ dropDownByIndex.getOptions().size());

       if (dropDownByIndex.isMultiple()){

           dropDownByIndex.selectByIndex(1);

           //locator: Find with cssSelector by Id

           Select dropDownByVisibleText = new Select(driver.findElement(By.cssSelector("#select-menu")));
           dropDownByVisibleText.selectByVisibleText("10+");


           //locator: Find with cssSelector by tag and Id

           Select dropDownByValue = new Select(driver.findElement(By.cssSelector("select#select-menu")));
           dropDownByValue.selectByValue("3");
       }

        Thread.sleep(3000);


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
