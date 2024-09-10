package P111;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTest {

    WebDriver driver;
    public void setUp() {
        
    	WebDriver driver=new ChromeDriver();
        driver = new ChromeDriver();
        driver.get("https://app.germanyiscalling.com/");
    }

    // Test method for successful login
    public void testSuccessfulLogin() {
        System.out.println("Running successful login test...");
        // Enter valid username and password
        driver.findElement(By.id("username")).sendKeys("validUsername");
        driver.findElement(By.id("password")).sendKeys("validPassword");
        driver.findElement(By.id("loginButton")).click();

       
        String expectedUrl = "https://app.germanyiscalling.com/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Test Passed: Successfully logged in and redirected.");
        } else {
            System.out.println("Test Failed: Redirection failed after login.");
        }
    }

    // Test method for unsuccessful login
    public void testUnsuccessfulLogin() {
        System.out.println("Running unsuccessful login test...");
        // Enter invalid username and password
        driver.findElement(By.id("username")).sendKeys("invalidUsername");
        driver.findElement(By.id("password")).sendKeys("invalidPassword");
        driver.findElement(By.id("loginButton")).click();

        // Verify the error message
        String expectedError = "Invalid credentials";
        String actualError = driver.findElement(By.id("errorMessage")).getText();
        if (actualError.contains(expectedError)) {
            System.out.println("Test Passed: Correct error message displayed.");
        } else {
            System.out.println("Test Failed: Incorrect error message.");
        }
    }

    // Clean up (quit the driver)
    public void tearDown() {
        System.out.println("Closing the browser...");
        driver.quit();
    }

    // Main method to run the tests
    public static void main(String[] args) {
        LoginTest test = new LoginTest();

        // Set up WebDriver
        test.setUp();

        // Run the successful login test
        test.testSuccessfulLogin();

        // Run the unsuccessful login test
        test.testUnsuccessfulLogin();

        // Clean up WebDriver
        test.tearDown();
    }
}
