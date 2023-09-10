package Selenium_Qu03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomationAnywhereTest_Qu03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set the path to the ChromeDriver executable & Initialize the ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SISPAMPATHY\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver =new ChromeDriver(option);
		
		//Open the website
		driver.get("https://www.automationanywhere.com/");
		
		//Task a: Verify the Automation Anywhere logo should be present
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[1]/div/a/img"));
		boolean isLogoPresent = logo.isDisplayed();
		System.out.println("Automation Anywhere logo is present: " + isLogoPresent);
		
		//Task b: Verify the Request demo button is present and verify if it is clickable or not
		WebElement requestDemoButton = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[1]/div[2]/a"));
		boolean isRequestDemoButtonPresent = requestDemoButton.isDisplayed();
		boolean isRequestDemoButtonClickable = requestDemoButton.isEnabled();
		
		System.out.println("Request demo button is present: " + isRequestDemoButtonPresent);
		System.out.println("Request demo button is clickable: " + isRequestDemoButtonClickable);
		
		//Close the Chrome browser
		driver.quit();

	}

}
