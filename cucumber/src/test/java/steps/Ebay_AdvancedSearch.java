package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.fail;

public class Ebay_AdvancedSearch {
    WebDriver driver;

    @Given("I am on Ebay Advanced Search Page")
    public void i_am_on_ebay_advanced_search_page() {
        System.setProperty("webdriver.chrome.driver", "C:/WebDriver/bin/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/sch/ebayadvsearch");
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }





}
