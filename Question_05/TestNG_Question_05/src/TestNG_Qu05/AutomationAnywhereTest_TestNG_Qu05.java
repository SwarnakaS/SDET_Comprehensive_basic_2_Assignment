package TestNG_Qu05;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationAnywhereTest_TestNG_Qu05 {

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SISPAMPATHY\\Documents\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);

		// Open the website
		driver.get("https://www.automationanywhere.com/");
	}
}
