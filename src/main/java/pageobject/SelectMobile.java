package pageobject;

import driver.DriverHelpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import propertiesFile.Configuration;

import java.util.List;

public class SelectMobile extends DriverHelpers{

    @FindBy(css= Configuration.selectitem)
    public List<WebElement> selectitem;

    public void selectmobile(String mobileAcce)
    {
        for(WebElement element:selectitem)
        {
            if(element.getText().equalsIgnoreCase(mobileAcce))
            {
                element.click();
                break;
            }
        }
    }
}
