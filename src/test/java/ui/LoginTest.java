package ui;
import org.testng.annotations.Test;
import utils.RetryAnalyzer;


public class LoginTest extends BaseUiTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginShouldWork() {
        page.navigate("https://www.saucedemo.com/");
        page.fill("#user-name", "standard_user");
        page.fill("#password", "secret_sauce");
        page.click("#login-button");
    }
}