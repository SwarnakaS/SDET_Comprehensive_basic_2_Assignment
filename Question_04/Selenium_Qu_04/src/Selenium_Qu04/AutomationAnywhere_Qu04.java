package Selenium_Qu04;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationAnywhere_Qu04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set the path to the ChromeDriver executable & Initialize the ChromeDriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SISPAMPATHY\\Documents\\chromedriver_win32\\chromedriver.exe");

		// Launch a browser in Chrome
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.automationanywhere.com/");
		Thread.sleep(2000);

		// Verify the presence of each element
		WebElement productsLink = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[1]"));
		WebElement solutionsLink = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[2]"));
		WebElement resourcesLink = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[3]"));
		WebElement beyondRPALink = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[4]"));
		WebElement companyLink = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[5]"));

		List<WebElement> linksToVerify = Arrays.asList(productsLink, solutionsLink, resourcesLink, beyondRPALink,
				companyLink);
		for (WebElement link : linksToVerify) {
			if (link.isDisplayed()) {
				System.out.println("Link '" + link.getText() + "' is present on the home page. ");
				link.click();

				//Wait for the page to load 
				WebDriverWait wait = new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.urlContains("https://www.automationanywhere.com/"));
				
				
				if(driver.getCurrentUrl().contains("https://www.automationanywhere.com")) {
					System.out.println("Navigation to '" + link.getText() + "' is successful ");
				}else {
					System.out.println("Navigation to '" + link.getText() + "' is failed ");
					driver.navigate().back();
				}
				
				//Close the browser after verification
				driver.close();
			}

		}

	}

}
