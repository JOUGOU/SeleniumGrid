package ScriptSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class FirefoxTest {

    private WebDriver driver;
    JavascriptExecutor js;
    @Before
    public void setUp() throws MalformedURLException {
        FirefoxOptions firefoxoptions = new FirefoxOptions();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/"), firefoxoptions);
        js = (JavascriptExecutor) driver;
    }
    @After
    public void TearDown(){
        driver.quit();
    }
    @Test
    public void testSearch() {
        driver.get("https://www.google.fr/");
        driver.manage().window().setSize(new Dimension(1232, 640));
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.name("q")).sendKeys("ok");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
}
