package api;

import com.microsoft.playwright.*;
import org.testng.annotations.*;

public class BaseApiTest {

    protected Playwright playwright;
    protected APIRequestContext api;

    @BeforeMethod
    public void setup() {
        // Create Playwright instance
        playwright = Playwright.create();

        // Create API context with base URL
        api = playwright.request().newContext(
                new APIRequest.NewContextOptions()
                        .setBaseURL("https://jsonplaceholder.typicode.com") // new API
        );
    }

    @AfterMethod
    public void teardown() {
        if (playwright != null) playwright.close();
    }
}