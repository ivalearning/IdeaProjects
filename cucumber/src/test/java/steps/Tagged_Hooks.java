package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Tagged_Hooks {
    private WebDriver driver;

    public Tagged_Hooks(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
    }


    @After(value="@TestAfterHook", order=1)
    public void testAfterHook() {
        System.out.println("Test After Hook");
    }

    @Before(value="@setCookies", order=0) // radi se podle toho, jak chci poradi spusteni
    public void setCookies() {
        System.out.println("cookies hook executed");
    }
    public WebDriver getDriver() {
        return driver;
    }
}
