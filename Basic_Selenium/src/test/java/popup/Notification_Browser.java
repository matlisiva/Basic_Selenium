package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_Browser {
	public static void main(String[] args) {
		//take care of driver executables
				WebDriverManager.chromedriver().setup();
				ChromeOptions Options=new ChromeOptions();
				Options.addArguments("--disable-notifications");
				//opens empty browser
				WebDriver driver=new ChromeDriver(Options);
				//maximizes the browser
				driver.manage().window().maximize();
				
	}

}
