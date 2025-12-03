package api;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.RequestOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginApiTest extends BaseApiTest {

    @Test
    public void loginApiSimulation() {
        // Simulate login via POST to /posts
        APIResponse response = api.post("/posts",
                RequestOptions.create()
                        .setHeader("Content-Type", "application/json")
                        .setData("{\"title\":\"loginTest\",\"body\":\"loginBody\",\"userId\":1}")
        );

        // JSONPlaceholder returns 201 for successful POST
        Assert.assertEquals(response.status(), 201);

        // Optional: print response body
        System.out.println(response.text());
    }

    @Test
    public void getUserTest() {
        // GET request example
        APIResponse response = api.get("/users/1");
        Assert.assertEquals(response.status(), 200);
        System.out.println(response.text());
    }
}
