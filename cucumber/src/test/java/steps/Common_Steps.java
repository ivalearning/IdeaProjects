package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common_Steps {
    private WebDriver driver;

    @Before //Hooks - pridava se pred kazdy scenar
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:/WebDriver/bin/chromedriver.exe"); // not needed in Selenium v4
        driver = new ChromeDriver();
    }
    @After  //Hooks - pridava se za kazdy scenar
    public void tearDown() throws Exception {
       // driver.quit();
        Thread.sleep(10000);
    }

    public WebDriver getDriver() {
        return driver;
    }


}
