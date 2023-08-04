package Drop_Down;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Amazon {
	public static  void main(String[] args) throws Throwable {
		//take care of driver executables
		WebDriverManager.chromedriver().setup();
		//opens empty browser
		WebDriver driver=new ChromeDriver();
		//maximizes the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//enters the url
		driver.get("https://www.amazon.in/");
		//adress of the dropdown
		WebElement drop = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		//create an object for select class
		Select s=new Select(drop);
		//selecting the values through index
		s.selectByIndex(7);
		Thread.sleep(2000);
		//select the value
		s.selectByValue("search-alias=amazon-pharmacy");
		//select by visible text
		s.selectByVisibleText("Amazon Pharmacy");
		if(s.isMultiple()) {
			System.out.println("This is multidropdown");
		}
		else
		{
			System.out.println("this is single dropdown");
		}
		//print all the option which are in dropdown
		List<WebElement> alloption = s.getOptions();
		for(WebElement b:alloption) {
			System.err.println(b.getText());
			
		}
		driver.close();
	}

}
