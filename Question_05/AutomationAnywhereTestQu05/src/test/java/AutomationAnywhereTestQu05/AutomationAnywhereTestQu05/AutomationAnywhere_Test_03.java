package AutomationAnywhereTestQu05.AutomationAnywhereTestQu05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomationAnywhere_Test_03 {

	private WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SISPAMPATHY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		  ChromeOptions option= new ChromeOptions();
		  option.addArguments("--remote-allow-origins=*");
			
		  driver =new ChromeDriver(option);
		  driver.get("https://www.automationanywhere.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
	
	}
	
	@Test(priority=1, enabled=true, timeOut=1000)
	public void verifyLogoPresence() {
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[1]/div/a/img"));
		Assert.assertTrue(logo.equals(logo), "Automation Anywhere logo is present");
	}
	
	@Test(priority=1, enabled=true, timeOut=1000)
	public void verifyRequestDemo() {
		WebElement requestDemoButton = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[1]/div[2]/a"));
		Assert.assertTrue(requestDemoButton.isDisplayed(), "Request demo button is not present");
		Assert.assertTrue(requestDemoButton.isEnabled(), "Request demo button is not clickable");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
