package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class DriverHelpers {
    public static WebDriver driver;
    public static Actions actions;

    private String browserToExecutes="chrome";

    public DriverHelpers(){
        PageFactory.initElements(driver,this);
    }

    public void openBrowser(){
        if("chrome".equals(browserToExecutes)){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if("ie".equals(browserToExecutes)){
            WebDriverManager.iedriver().setup();
            driver=new InternetExplorerDriver();

        }
        else if("opera".equals(browserToExecutes)){
            WebDriverManager.operadriver().setup();
            driver=new OperaDriver();

        }
        else {
            driver=new FirefoxDriver();
        }
    }
    public void maximizeBrowser(){ driver.manage().window().maximize();}
    public void nevigateToUrl(String url){driver.get(url);}
    public void applyImpWaits(){driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);}
    public void applyActions(){actions=new Actions(driver);}
    public void closeBrowser(){driver.quit();}


}
