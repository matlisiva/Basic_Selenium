package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {
	public static void main(String[] args) throws Throwable {
		//take care of driver executables
		WebDriverManager.chromedriver().setup();
		//opens empty browser
		WebDriver driver=new ChromeDriver();
		//maximizes the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//enters the url
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		//address the block1
		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		//address the block4
		WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		//create  an object
		Actions a=new Actions(driver);
		a.dragAndDrop(block1,block4).perform();
		Thread.sleep(5000);
		//close the application
		driver.close();
	}

}
