package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Login {
	//Declaration
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTb;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordtb;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;

	public WebElement getEmailTb() {
		return emailTb;
	}

	public void setEmailTb(WebElement emailTb) {
		this.emailTb = emailTb;
	}

	public WebElement getPasswordtb() {
		return passwordtb;
	}

	public void setPasswordtb(WebElement passwordtb) {
		this.passwordtb = passwordtb;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}
	//initialization
	public Fb_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void emailTextField(String data) {
		emailTb.sendKeys(data);
	}
	public void passwordTextField(String data) {
		passwordtb.sendKeys(data);
	}
	public void loginButton() {
		loginBtn.click();
	}

}
