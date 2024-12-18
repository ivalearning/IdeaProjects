package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Ebay_Home_elements {
    WebDriver driver;

    @FindBy(linkText = "Pokročilé") public WebElement advancedLink;
    @FindBy(xpath = "//*[@id=\"gh-ac\"]") public WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"gh-btn\"]") public WebElement searchButton;
    @FindBy(css = "h1.srp-controls__count-heading>span.BOLD:first-child") public WebElement numOfLines;
    @FindBy(xpath = "//select[@id='gh-cat']/option") public List<WebElement> categoryOptions;
    @FindBy(linkText = "{string}") public WebElement clickOnLinkByText;

    public Ebay_Home_elements(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

}
