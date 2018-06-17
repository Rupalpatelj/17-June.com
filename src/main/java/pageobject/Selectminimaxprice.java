package pageobject;

import driver.DriverHelpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import propertiesFile.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Selectminimaxprice extends DriverHelpers{

    @FindBy(css = Configuration.pricemin)
    public WebElement pricemin;


    public void selectminimumPrice(String minimum)
    {


     Select priceMin =new Select(pricemin);
        System.out.println(priceMin.toString());
     priceMin.selectByIndex(4);

     //priceMin.selectByValue(minimum);

    }



}
