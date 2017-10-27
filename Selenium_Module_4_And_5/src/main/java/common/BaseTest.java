package common;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	//*****Connecting to cloud*****
//	@BeforeTest
//	@Parameters({"Browser"})
//	public void openBrowser(String browserName) throws MalformedURLException{
//		
//		String URL = "http://opensource.demo.orangehrmlive.com/";
//		
//		//setting capabilities
//		DesiredCapabilities cap = null;
//		if(browserName.equalsIgnoreCase("firefox")){
//			cap = new DesiredCapabilities();
//			cap.setPlatform(Platform.WIN8_1);
//			cap.setBrowserName(browserName);
//			cap.setCapability("Version", "43.0");
//		}
//		if(browserName.equalsIgnoreCase("IPAD")){
//			cap = new DesiredCapabilities();
//			DesiredCapabilities.ipad();
//			cap.setPlatform(Platform.ANY);
//			cap.setBrowserName(browserName);
//		}
//		
//		//Sauce Labs connection
//		String USERNAME = "spuranik";
//		String ACCESS_KEY = "736a3a0f-ecb2-426a-bcd2-95c316708ce1";
//		String CLOUD_URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
//		
//		//Passing capabilities to sauce labs
//		driver = new RemoteWebDriver(new URL(CLOUD_URL), cap);
//		driver.manage().window().maximize();
//		driver.get(URL); 
//	}
	
	//*****Executing using selenium grid*****
//	@BeforeTest
//	@Parameters({"Browser"})
//	public void openBrowser(String browserName) throws MalformedURLException{
//		
//		String URL = "http://opensource.demo.orangehrmlive.com/";
//		String Node = "http://10.55.0.152:4444/wd/hub";
//		
//		DesiredCapabilities cap = null;
//		if(browserName.equalsIgnoreCase("firefox")){
//			cap = new DesiredCapabilities();
//			cap.setPlatform(Platform.WIN8_1);
//			cap.setBrowserName(browserName);
//		}
//		if(browserName.equalsIgnoreCase("ipad")){
//			cap = new DesiredCapabilities();
//			DesiredCapabilities.ipad();
//		}
//		
//		driver = new RemoteWebDriver(new URL(Node), cap);
//		driver.manage().window().maximize();
//		driver.get(URL);
//	}
	
	//*****Normal execution using TestNg****
	@BeforeTest
	@Parameters({"Browser"})
	public void openBrowser(String browserName){
		if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/allDrivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://opensource.demo.orangehrmlive.com/");
		}
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/allDrivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://opensource.demo.orangehrmlive.com/");
		}
	}
	
	@AfterTest
	public void closeBrowser(){
		driver.quit();
	}
}
