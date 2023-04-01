package aditya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPage {
	public RegPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id=\"gender-male\"]")
	private WebElement genMale;
	@FindBy(xpath="//input[@id=\"FirstName\"]")
	private WebElement fName;
	@FindBy(xpath="//input[@id=\"LastName\"]")
	private WebElement lName;
	@FindBy(xpath="//input[@id=\"Email\"]")
	private WebElement email;
	@FindBy(xpath="//input[@id=\"Password\"]")
	private WebElement pwd;
	@FindBy(xpath="//input[@id=\"ConfirmPassword\"]")
	private WebElement confPwd;
	@FindBy(xpath="//input[@id=\"register-button\"]")
	private WebElement regBTN;
	public WebElement getGenMale() {
		return genMale;
	}
	public WebElement getfName() {
		return fName;
	}
	public WebElement getlName() {
		return lName;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getConfPwd() {
		return confPwd;
	}
	public WebElement getRegBTN() {
		return regBTN;
	}
	
	
}
