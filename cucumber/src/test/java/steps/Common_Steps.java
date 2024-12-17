package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common_Steps {
    private WebDriver driver;

    @Before (order=0) //Hooks - pridava se pred kazdy scenar (order nemusi byt)
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:/WebDriver/chromedriver.exe"); // not needed in Selenium v4
        driver = new ChromeDriver();
        System.out.println("Global hook executed");
    }

    @After (order=1) //Hooks - pridava se za kazdy scenar
    public void tearDown() throws Exception {
        driver.quit();
        System.out.println("Global After Hook");
        Thread.sleep(5000);
    }

public WebDriver getDriver() {
        return driver;
}

}
