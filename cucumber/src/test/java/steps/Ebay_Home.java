package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Ebay_Home {
    @Given("I am on Ebay Home Page")
    public void i_am_on_ebay_home_page() {
        System.out.println("from Home page");
    }

    @When("I click on Advanced Link")
    public void i_click_on_advanced_link() {
        System.out.println("Click to Advanced");
    }

    @Then("I navigate to Advanced Search Page")
    public void i_navigate_to_advanced_search_page() {
        System.out.println("be directed to");
    }




}
