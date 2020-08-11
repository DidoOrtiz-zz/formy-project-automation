package utilSteps;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralSteps {

    private static WebDriver driver;

    private String link = "https://formy-project.herokuapp.com/form";

    @Before
    public void openBrowserWithLink() {

        System.getProperty("webdriver.chrome.driver", "/Users/didiortiz/Documents/automation/LinkedinCourses/Ex_Files_Selenium_EssT/chromedriver");

        driver = new ChromeDriver();
        driver.get(link);

    }


    public void closeBrowser() {
       driver.quit();
    }

    public WebDriver getDriver() {
        return this.driver;
    }


}




