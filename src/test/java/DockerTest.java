import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DockerTest {

    public WebDriver driver;

    @BeforeEach
    public void setUp() throws MalformedURLException {
//        String userDir = System.getProperty("user.dir");
//        System.out.println(userDir);
//        System.setProperty("webdriver.chrome.driver", userDir + "/drivers/chromedriver-linux-64bit");
        String selenoid = "http://192.168.0.41:4445/wd/hub";

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        chromeOptions.setCapability(CapabilityType.BROWSER_VERSION, "101.0");
        chromeOptions.setCapability("enableVNC", true);
        chromeOptions.setCapability("enableVideo", false);
        driver = new RemoteWebDriver(
                URI.create(selenoid).toURL(),
                chromeOptions);
        driver.manage().window().maximize();


//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
    }


    @Test
    public void exampleTest() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(10000);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }


}
