package steps;

import actions.Common_Actions;
import actions.Ebay_AdvancedSearch_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.fail;

public class Ebay_AdvancedSearch {

    Common_Actions common_actions;
    Ebay_AdvancedSearch_Actions ebay_advancedSearch_actions;

    public Ebay_AdvancedSearch(Common_Actions common_actions, Ebay_AdvancedSearch_Actions ebay_advancedSearch_actions) {
        this.common_actions = common_actions;
        this.ebay_advancedSearch_actions = ebay_advancedSearch_actions;
    }

    @Given("I am on Ebay Advanced Search Page")
    public void i_am_on_ebay_advanced_search_page() {
    //    driver.get("https://www.ebay.com/sch/ebayadvsearch");
    //    driver.manage().window().maximize();

        common_actions.goToUrl("https://www.ebay.com/sch/ebayadvsearch");
        common_actions.MaximizePage();

            }

    @When("I click on Ebay Logo")
    public void i_click_on_ebay_logo() {
    //    driver.findElement(By.xpath("//*[@id=\"gh-logo\"]")).click();
        ebay_advancedSearch_actions.clickOnEbayLogo();


    }
    @Then("I navigated to Home Page")
    public void i_navigated_to_home_page() {
        String expectedUrl = "https://www.ebay.com/";
        String actualUrl = common_actions.getCurrentPageUrl(); //driver.getCurrentUrl();
        if (!expectedUrl.equals(actualUrl)) {
            fail("Page url doesnt correspond to the expected");
        }

    }

    @When("I advanced search an Item")
    public void i_advanced_search_an_item(DataTable dataTable) {
        //driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(dataTable.cell(1,0));
        //driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys(dataTable.cell(1,1));
        //driver.findElement(By.xpath("//input[@name='_udlo']")).sendKeys(dataTable.cell(1,2));
        //driver.findElement(By.xpath("//input[@name='_udhi']")).sendKeys(dataTable.cell(1,3));
        //driver.findElement(By.cssSelector(".btn.btn--primary[data-marko='{\"onclick\":\"handleClick s0-1-17-12 false\",\"onkeydown\":\"handleKeydown s0-1-17-12 false\",\"onfocus\":\"handleFocus s0-1-17-12 false\",\"onblur\":\"handleBlur s0-1-17-12 false\"}']")).click();
        //driver.findElement(By.xpath("//div[@class='adv-form__actions']//button[@type='submit'][normalize-space()='Vyhledat']")).click();

        ebay_advancedSearch_actions.enterSearchString(dataTable.cell(1,0));
        ebay_advancedSearch_actions.enterExclString(dataTable.cell(1,1));
        ebay_advancedSearch_actions.enterMinPrice(dataTable.cell(1,2));
        ebay_advancedSearch_actions.enterMaxPrice(dataTable.cell(1,3));
        ebay_advancedSearch_actions.searchBtn();

    }



}
