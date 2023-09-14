package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	
	private WebDriver driver;

	// 1. By Locators: OR
	private By firstName = By.id("customer.firstName");
	private By lastName = By.id("customer.lastName");
	private By address = By.id("customer.address.street");
	private By city = By.id("customer.address.city");
	
	private By state = By.id("customer.address.state");
	private By zipCode = By.id("customer.address.zipCode");
	private By phoneNumber = By.id("customer.phoneNumber");
	
	private By ssn = By.id("customer.ssn");
	private By username = By.id("customer.username");
	private By password = By.id("customer.password");
	
	private By confirm = By.id("repeatedPassword");
	
	private By registerbtn = By.xpath("//input[@value='Register']");
	
	private By usernamefetch= By.xpath("//h1[@class='title']");
	
	// 2. Constructor of the page class:
		public RegistrationPage(WebDriver driver) {
			this.driver = driver;
		}

	

	public void enterfirstname(String firstname) {
		driver.findElement(firstName).sendKeys(firstname);
	}

	public void enterlastName(String lastname) {
		driver.findElement(lastName).sendKeys(lastname);
	}
	
	public void enterAddress(String Address) {
		driver.findElement(address).sendKeys(Address);
	}
	public void enterCity(String City) {
		driver.findElement(city).sendKeys(City);
	}
	public void enterState(String State) {
		driver.findElement(state).sendKeys(State);
	}
	public void enterZipcode(String Zipcode) {
		driver.findElement(zipCode).sendKeys(Zipcode);
	}
	public void enterPhoneNumber(String PhoneNumber) {
		driver.findElement(phoneNumber).sendKeys(PhoneNumber);
	}
	public void enterSsn(String Ssn) {
		driver.findElement(ssn).sendKeys(Ssn);
	}
	public void enterUsername(String Username) {
		driver.findElement(username).sendKeys(Username);
	}
	public void enterPassword(String Password) {
		driver.findElement(password).sendKeys(Password);
	}
	
	public void enterConfirm(String Confirm) {
		driver.findElement(confirm).sendKeys(Confirm);
	}
	
	public void clickOnRegister() {
		driver.findElement(registerbtn).click();
	}
	
	

	
	public String getregistrationsuccessfulPageTitle() {
		return driver.getTitle();
	}

	public String getusernameafterLogin() {
		
		String usernamechar[]=driver.findElement(usernamefetch).getText().split(" ");
		String username= usernamechar[1];
		
		return username;
	}
}
