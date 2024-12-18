package actions;

import elements.Ebay_AdvancedSearch_elements;
import org.openqa.selenium.WebDriver;
import steps.Common_Steps;

public class Ebay_AdvancedSearch_Actions {

    private WebDriver driver;
    Ebay_AdvancedSearch_elements ebay_advancedSearch_elements;

    public Ebay_AdvancedSearch_Actions(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
        ebay_advancedSearch_elements = new Ebay_AdvancedSearch_elements(driver);
    }

    public void clickOnEbayLogo() {
        ebay_advancedSearch_elements.ebayLogo.click();
    }

    public void enterSearchString(String string) {
        ebay_advancedSearch_elements.searchString.sendKeys(string);
    }

    public void enterExclString(String string) {
        ebay_advancedSearch_elements.excludeString.sendKeys(string);
    }

    public void enterMinPrice(String string) {
        ebay_advancedSearch_elements.minPrice.sendKeys(string);
    }

    public void enterMaxPrice(String string) {
        ebay_advancedSearch_elements.maxPrice.sendKeys(string);
    }

    public void searchBtn() {
        ebay_advancedSearch_elements.srchBtn.click();
    }


}
