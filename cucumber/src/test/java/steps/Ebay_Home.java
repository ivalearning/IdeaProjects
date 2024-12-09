package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.fail;


public class Ebay_Home {
    WebDriver  driver;

    @Given("I am on Ebay Home Page")
    public void i_am_on_ebay_home_page()     {
        System.setProperty("webdriver.chrome.driver", "C:/WebDriver/bin/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        System.out.println("from Home page");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, SECONDS);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver,30);
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

    @When("I search for iPhone11")
    public void i_search_for_i_phone11() {
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("iPhone11");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();

        System.out.println("+");
    }

    @Then("I validate at least {int} search items present")
    public void i_validate_at_least_search_items_present(Integer int1) {
        String itemCount = driver.findElement(By.cssSelector("h1.srp-controls__count-heading>span.BOLD:first-child")).getText().trim();
        String itemCount2 = itemCount.replace(" ","");
        int itemCountInt = Integer.parseInt(itemCount2);
        if(itemCountInt <= 1000) {
            fail("Less than 1000 results found");
        }

        System.out.println(itemCountInt);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


    @When("I click on Mapa Webu")
    public void i_click_on_mapa_webu() {
        driver.findElement(By.linkText("Mapa webu")).click();

    }

    @When("I click on Audiobooks")
    public void i_click_on_audiobooks() {
        driver.findElement(By.linkText("Audiobooks"));
        System.out.println("++");
    }

    @Then("I navigate to Audiobooks catalog")
    public void i_navigate_to_audiobooks_catalog() {
        String expUrl = "https://www.ebay.com/b/Audiobooks/29792/bn_317579";
        String actualUrl = driver.getCurrentUrl();
        if (!actualUrl.equals(expUrl))
            fail("other than expected");
}

    @Then("I can search by Writer")
    public void i_can_search_by_writer() {
        System.out.println("4+");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    @When("I click on Napoveda")
    public void i_click_on_napoveda() {
        driver.findElement(By.xpath("//*[@id=\"gh-p-3\"]/a")).click();
        driver.manage().timeouts().pageLoadTimeout(10, SECONDS);
                System.out.println("+");
    }

    @Then("I navigate to Napoveda Page")
    public void i_navigate_to_napoveda_page() {
        String helpUrl = "https://cz.ebay.de/help/home";
        String actUrl = driver.getCurrentUrl();

            if(!actUrl.equals(helpUrl))
                fail("url do not match");
        driver.quit();
        System.out.println("+1");
        }





    }





