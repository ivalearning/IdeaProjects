package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_AdvancedSearch_elements {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"gh-logo\"]") public WebElement ebayLogo;
    @FindBy(xpath = "//input[@id='_nkw']") public WebElement searchString;
    @FindBy(xpath = "//input[@id='_ex_kw']") public WebElement excludeString;
    @FindBy(xpath = "//input[@name='_udlo']") public WebElement minPrice;
    @FindBy(xpath = "//input[@name='_udhi']") public WebElement maxPrice;
    @FindBy(css = "body > div.page-grid-container > div > main > form > div.adv-form__actions > button") public WebElement srchBtn;

    public Ebay_AdvancedSearch_elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }







}
