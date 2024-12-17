package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.fail;

public class Ebay_AdvancedSearch {
    private WebDriver driver;

    public Ebay_AdvancedSearch(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
    }

    @Given("I am on Ebay Advanced Search Page")
    public void i_am_on_ebay_advanced_search_page() {
        driver.get("https://www.ebay.com/sch/ebayadvsearch");
        driver.manage().window().maximize();
            }

    @When("I click on Ebay Logo")
    public void i_click_on_ebay_logo() {
        driver.findElement(By.xpath("//*[@id=\"gh-logo\"]")).click();

    }
    @Then("I navigated to Home Page")
    public void i_navigated_to_home_page() {
        String expectedUrl = "https://www.ebay.com/";
        String actualUrl = driver.getCurrentUrl();
        if (!expectedUrl.equals(actualUrl)) {
            fail("Page url doesnt correspond to the expected");
        }

    }

    @When("I advanced search an Item")
    public void i_advanced_search_an_item(DataTable dataTable) {
        driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(dataTable.cell(1,0));
        driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys(dataTable.cell(1,1));
        driver.findElement(By.xpath("//input[@name='_udlo']")).sendKeys(dataTable.cell(1,2));
        driver.findElement(By.xpath("//input[@name='_udhi']")).sendKeys(dataTable.cell(1,3));
        driver.findElement(By.cssSelector(".btn.btn--primary[data-marko='{\"onclick\":\"handleClick s0-1-17-12 false\",\"onkeydown\":\"handleKeydown s0-1-17-12 false\",\"onfocus\":\"handleFocus s0-1-17-12 false\",\"onblur\":\"handleBlur s0-1-17-12 false\"}']")).click();
        //driver.findElement(By.xpath("//div[@class='adv-form__actions']//button[@type='submit'][normalize-space()='Vyhledat']")).click();


    }



}
