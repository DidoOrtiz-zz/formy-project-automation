
import org.openqa.selenium.WebDriver;
import pages.WebFormPage;
import utilSteps.GeneralSteps;


public class WebFormTest extends GeneralSteps{

    WebFormPage webFormPage;


    public static void main(String[] args) throws InterruptedException {

        WebFormTest webFormTest = new WebFormTest();

        WebDriver driver = webFormTest.load();

        webFormTest.initWebFormPage();
        webFormTest.selectDrpInd(driver);

        webFormTest.close();


    }

    public void initWebFormPage(){

        this.webFormPage = new WebFormPage();

    }


    public WebDriver load(){
        return getDriver();

    }

    public void selectDrpInd(WebDriver driver) throws InterruptedException {
        webFormPage.selectDrpByIndex(driver);
    }

    public void close(){
        closeBrowser();
    }




}
