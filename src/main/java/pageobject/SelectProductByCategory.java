package pageobject;

import driver.DriverHelpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import propertiesFile.Configuration;

import java.util.List;

public class SelectProductByCategory extends DriverHelpers {

    @FindBy(css = Configuration.technology)
    public List<WebElement> technology;

    public void selectTechnology(String techno) {
        for(WebElement element:technology)
        {
            if(element.getText().equalsIgnoreCase(techno))
            {
                element.click();
                break;
            }
        }
    }

}
