package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverHelpers;
import pageobject.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;


public class ClearanceStepDef {

    HomePage homePage=new HomePage();
    SelectProductByCategory selectProductByCategory=new SelectProductByCategory();
    DriverHelpers driverHelpers=new DriverHelpers();
    SelectMobile selectmobile=new SelectMobile();
    SelectByPrice selectbyprice =new SelectByPrice();
    Selectminimaxprice selectminimaxprice=new Selectminimaxprice();
    SelectMaxPrice selectMaxPrice=new SelectMaxPrice();

    @Given("^I am on Homepage$")
    public void i_am_on_Homepage() {
        String expected=homePage.isOnHomePage();
        assertThat(expected,endsWith("co.uk/"));

    }
    @When("^I click on CLEARANCE$")
    public void i_click_on_CLEARANCE() {
        homePage.selectclearancebtn();
    }

    @When("^I click on \"([^\"]*)\"$")
    public void i_click_on(String arg1) {

     selectProductByCategory.selectTechnology(arg1);

    }
    @When("^I navigate on \"([^\"]*)\"$")
    public void i_navigate_on(String arg1) {
        selectmobile.selectmobile(arg1);

    }
    @When("^I select a product \"([^\"]*)\"$")
    public void i_select_a_product(String arg1){
        selectbyprice.selectbyprice(arg1);



        }


    @When("^I select minimumprice \"([^\"]*)\"$")
    public void i_select_minimumprice(String arg1){
        driverHelpers.applyImpWaits();
        selectminimaxprice.selectminimumPrice(arg1);
    }

    @When("^I select maximumprice \"([^\"]*)\"$")
    public void i_select_maximumprice(String arg1) {
       driverHelpers.applyImpWaits();
        selectMaxPrice.selectmaximumPrice(arg1);


    }

    @Then("^I can view selected clearance product$")
    public void i_can_view_selected_clearance_product() {
       String crtpage=selectMaxPrice.assertthevalue();
       assertThat(crtpage,endsWith("%7C2"));

    }

}
