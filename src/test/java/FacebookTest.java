import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
public class FacebookTest {

	


	    WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	    	 // Setup ChromeOptions
	        ChromeOptions options = new ChromeOptions();
	        options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
	       

	        // Setup WebDriver using WebDriverManager for Chrome with specific version
	        WebDriverManager.chromedriver().driverVersion("123.0.0").setup();
	        
	        // Initialize ChromeDriver
	        driver = new ChromeDriver(options);
	    }

	    @Test
	    public void openFacebook() {
	        // Open Facebook
	        driver.get("https://www.facebook.com/");
	        
	        // Optional: You can add assertions or further actions here
	    }

	   // @AfterClass
	   // public void tearDown() {
	        // Close the browser
	      //  if (driver != null) {
	           // driver.quit();
	        //}
	    //}
}
