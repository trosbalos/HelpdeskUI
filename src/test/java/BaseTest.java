
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public WebDriver driver;

    public BaseTest() {
    }

    @Before
    public void setup() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("config.properties"));
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--disable-notifications"});
        options.addArguments(new String[]{"--disable-popup-blocking"});
        options.addArguments(new String[]{"--start-maximized"});
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        this.driver = new ChromeDriver(options);
        this.driver.get(System.getProperty("site.url"));
    }

    @After
    public void tearDown() {
        if (this.driver != null) {
            this.driver.quit();
        }

    }
}