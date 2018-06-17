package pageobject;

import driver.DriverHelpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import propertiesFile.Configuration;

import java.util.List;

public class SelectByPrice extends DriverHelpers{

    @FindBy(css= Configuration.priceclick)
    public List<WebElement> priceclick;
    public void selectbyprice(String price)
    {
        for(WebElement element:priceclick)
        {
            if(element.getText().equalsIgnoreCase(price))
            {
                element.click();
                System.out.println(element.getText());
                break;
            }
        }
    }
}
