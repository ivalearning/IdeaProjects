package actions;

import elements.Ebay_Home_elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.Common_Steps;

import java.util.List;

public class Ebay_Home_Actions {
    private WebDriver driver;
    Ebay_Home_elements ebay_home_elements;

    public Ebay_Home_Actions(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
        ebay_home_elements=new Ebay_Home_elements(driver);
    }

    public void clickAdvancedLink(){
        ebay_home_elements.advancedLink.click();
        System.out.println("Clicked to Advanced");
    }

    public void searchAnItem(String searchString){
        ebay_home_elements.searchBox.sendKeys(searchString);
    }

    public void searchButton() {
        ebay_home_elements.searchButton.click();
    }

    public int getSearchItemsCount() {
        String itemCount = ebay_home_elements.numOfLines.getText().trim();
        String itemCount2 = itemCount.replace(" ", "");
        int itemCountInt = Integer.parseInt(itemCount2);
        return itemCountInt;
    }

    public void selectCategoryString(String option) {
        List<WebElement> cat = ebay_home_elements.categoryOptions;
        for(WebElement x : cat) {
            if (x.getText().trim().toLowerCase().equals(option.toLowerCase())) {
                x.click();
                break;
            }
        }
    }

    public void clickOnLinkText(String string) {
        ebay_home_elements.clickOnLinkByText.click();
    }









}
