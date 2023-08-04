package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Over {
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
		driver.get("https://www.snapdeal.com/");
		//fetch the address  of sign in
		WebElement signin = driver.findElement(By.xpath("//div[@class='myAccountTab accountHeaderClass col-xs-13 reset-padding']"));
		signin.click();
		//creating an object
		Actions a=new Actions(driver);
		//mouse over on sign in
		a.moveToElement(signin).perform();
		//clicking on the register
		driver.findElement(By.xpath("//span[@class='newUserRegister']")).click();
		Thread.sleep(5000);
		driver.close();		
	}

}
