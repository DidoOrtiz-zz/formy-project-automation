package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utilSteps.GeneralSteps;

public class WebFormPage {


    public void selectDrpByIndex(WebDriver driver) throws InterruptedException {

        Select dropDownByIndex = new Select(driver.findElement(By.id("select-menu")));

        dropDownByIndex.selectByIndex(0);

        Thread.sleep(2000);
    }

}
