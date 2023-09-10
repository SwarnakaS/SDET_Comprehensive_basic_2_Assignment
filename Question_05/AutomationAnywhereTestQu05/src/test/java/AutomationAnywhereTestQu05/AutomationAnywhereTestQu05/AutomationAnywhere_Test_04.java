package AutomationAnywhereTestQu05.AutomationAnywhereTestQu05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomationAnywhere_Test_04 {

	private WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SISPAMPATHY\\Documents\\chromedriver_win32\\chromedriver.exe");

		// Launch a browser in Chrome
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.automationanywhere.com/");
	}

	@Test(priority=1, enabled=true, timeOut=1000)
	public void verifyProductsLink() {
		WebElement productsLink = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[1]"));
		Assert.assertTrue(productsLink.isDisplayed(), "Products link is not present");
		productsLink.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("/products"), "Navigation to Products failed");
		driver.navigate().back();
		
	}
	
	@Test(priority=2, enabled=true, timeOut=1000)
	public void verifySolutionsLink() {
		WebElement solutionsLink = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[2]"));
		Assert.assertTrue(solutionsLink.isDisplayed(), "Solutions link is not present");
		solutionsLink.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("/solutions"), "Navigation to Solutions failed");
		driver.navigate().back();
	}
	
	@Test(priority=3, enabled=true, timeOut=1000)
	public void verifyResourcesLink() {
		WebElement resourcesLink = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[3]"));
		Assert.assertTrue(resourcesLink.isDisplayed(), "Resources link is not present");
		resourcesLink.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("/resources"), "Navigation to Resources failed");
		driver.navigate().back();
	}
	
	@Test(priority=4, enabled=true, timeOut=1000)
	public void verifyBeyondRPALink() {
		WebElement beyondRPALink = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[4]"));
		Assert.assertTrue(beyondRPALink.isDisplayed(), "Beyond RPA link is not present");
		beyondRPALink.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("/beyond RPA"), "Navigation to Beyond RPA failed");
		driver.navigate().back();
	}
	
	@Test(priority=5, enabled=true, timeOut=1000)
	public void verifyCompanyLink() {
		WebElement companyLink = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[5]"));
		Assert.assertTrue(companyLink.isDisplayed(), "Company link is not present");
		companyLink.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("/company"), "Navigation to Company failed");
		driver.navigate().back();
	}
}
