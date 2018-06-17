import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.DriverHelpers;
import propertiesFile.Configuration;

public class Hooks  {

    private DriverHelpers driverHelpers=new DriverHelpers();

    @Before

    public void setUp(){

        driverHelpers.openBrowser();
        driverHelpers.nevigateToUrl(Configuration.testsite);
        driverHelpers.maximizeBrowser();
        driverHelpers.applyImpWaits();
    }


}
