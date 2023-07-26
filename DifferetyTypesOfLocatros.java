package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DifferetyTypesOfLocatros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String driverPath = System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		System.out.println(driverPath);
		// Launch the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://magento.softwaretestingboard.com/");
		//Sign in click
		
		//Give the deails Email id and password
		driver.findElement(By.xpath("//div[@class='text-input flex']/input[@id='session_key']")).sendKeys("");
	}

}
