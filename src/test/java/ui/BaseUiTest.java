package ui;

import com.microsoft.playwright.*;
import org.testng.annotations.*;

public class BaseUiTest {

    protected Playwright playwright;
    protected Browser browser;
    protected Page page;

    @BeforeMethod
    public void setup() {
        playwright = Playwright.create();

        boolean headless = Boolean.parseBoolean(System.getProperty("headless", "false"));

        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(headless)
        );

        page = browser.newContext().newPage();
    }

    @AfterMethod
    public void teardown() {
        playwright.close();
    }
}
