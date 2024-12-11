package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.fail;


public class Ebay_Home {
    WebDriver  driver;

    public Ebay_Home(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
    }

    @Given("I am on Ebay Home Page")
    public void i_am_on_ebay_home_page()     {
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
        System.out.println("Validation: Page url https://www.ebay.com/sch/ebayadvsearch opened");

    }

    @When("I search for {string}")
    public void i_search_for(String str1) {
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(str1);
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
    }

    @When("I search for {string} and {string} in category")
    public void i_search_for_and_in_category(String string, String string2) {
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(string);
        //driver.findElement(By.xpath("//*[@id=\"gh-cat\"]")).click();
        List<WebElement> cat = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
                for(WebElement x : cat) {
                    if(x.getText().trim().toLowerCase().equals(string2.toLowerCase())) {
                        x.click();
                        break;
                    }
                }

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


    }

    @Then("I validate at least {int} search items present")
    public void i_validate_at_least_search_items_present(int count) {
        String itemCount = driver.findElement(By.cssSelector("h1.srp-controls__count-heading>span.BOLD:first-child")).getText().trim();
        String itemCount2 = itemCount.replace(" ","");
        int itemCountInt = Integer.parseInt(itemCount2);
        if(itemCountInt <= count) {
            fail("Less than 1000 results found");
        }
        System.out.println(itemCountInt);
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
        System.out.println("+1");
        }

    @When("I click on {string}")
    public void i_click_on(String string) {
        driver.findElement(By.linkText(string)).click();
        driver.manage().timeouts().pageLoadTimeout(3, SECONDS);

    }

    @Then("I validate that page navigate to  {string} and title contains {string}")
    public void i_validate_that_page_navigate_to_and_title_contains(String url, String title) {
        String actUrl = driver.getCurrentUrl();
        String actTitle = driver.getTitle();

                if(!actUrl.equals(url)) {
                    fail("url not as expected" + url);
                }
                if(!actTitle.contains(title)) {
                    fail("Title does not contain the string" +title);
                }
    }



    }





