import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DockerTest {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        String userDir = System.getProperty("user.dir");
        System.out.println(userDir);
        System.setProperty("webdriver.chrome.driver", userDir + "/drivers/chromedriver-linux-64bit");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    @Test
    public void exampleTest() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(5000);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }


}
