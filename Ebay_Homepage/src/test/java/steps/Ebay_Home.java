package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import static org.junit.Assert.fail;


public class Ebay_Home {
    WebDriver  driver;

    @Given("I am on Ebay Home Page")
    public void i_am_on_ebay_home_page()     {
        System.setProperty("webdriver.chrome.driver", "C:/WebDriver/bin/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        System.out.println("from Home page");
    }

    @When("I click on Advanced Link")
    public void i_click_on_advanced_link() {
        driver.findElement(By.linkText("Pokročilé")).click();
        System.out.println("Click to Advanced");
    }

    @Then("I navigate to Advanced Search Page")
    public void i_navigate_to_advanced_search_page() {
        String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
        String actUrl = driver.getCurrentUrl();
        if (!actUrl.equals(expUrl)) {
            fail("Advanced search link not correct ");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Validation: Page url https://www.ebay.com/sch/ebayadvsearch opened");

    }



}
