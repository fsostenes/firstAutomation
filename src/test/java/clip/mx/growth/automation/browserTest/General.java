package clip.mx.growth.automation.browserTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class General {
	
	@Test
	public void firstTest() {
		System.setProperty("webdriver.chrome.driver", "src/test/java/resources/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://clip.mx");
		
		driver.quit();
		
		
	}



}
