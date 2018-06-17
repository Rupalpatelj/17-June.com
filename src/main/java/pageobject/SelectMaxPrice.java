package pageobject;

import driver.DriverHelpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import propertiesFile.Configuration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SelectMaxPrice extends DriverHelpers {

    @FindBy(xpath = Configuration.pricemax)
    public WebElement pricemax;

    public void selectmaximumPrice(String maximum) {
        Select priceMax = new Select(pricemax);
        priceMax.selectByIndex(0);

    }

    @FindBy(css = " ")
    public List<WebElement> allvalue;

    public String assertthevalue() {
        return driver.getCurrentUrl();


        }


}