package basic_Topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tag_Locators {
	public static void main(String[] args) {
		//managers the chrome driver
		WebDriverManager.chromedriver().setup();
		//launches the chrome driver
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//opens the application
		driver.get("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement linksList:links) {
			System.out.println(linksList.getText());
		}
		driver.close();
}	

}
