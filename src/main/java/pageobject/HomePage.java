package pageobject;

import driver.DriverHelpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import propertiesFile.Configuration;

import java.util.List;

public class HomePage extends DriverHelpers {

    public String isOnHomePage(){
        return driver.getCurrentUrl();
    }




    @FindBy(xpath = Configuration.clearancebtn)
    public WebElement clearancebtn;
    public void selectclearancebtn()
    {
        clearancebtn.click();

    }
}
