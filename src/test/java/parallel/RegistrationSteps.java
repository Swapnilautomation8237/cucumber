package parallel;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


import com.pages.RegistrationPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {

	private final RegistrationPage registrationPage = new RegistrationPage(DriverFactory.getDriver());

	@Given("user navigates to Registration page")
	public void user_navigates_to_Registration_page() {
		DriverFactory.getDriver().get("https://parabank.parasoft.com/parabank/register.htm");
	}

	@When("user fills the register from given sheetname {string} and rownumber {int}")
	public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber)
			throws InvalidFormatException, IOException {

		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData("C:\\Users\\SWAPNIL\\Desktop\\TestData.xlsx", sheetName);

		String firstname = testData.get(rowNumber).get("firstname");
		String lastname = testData.get(rowNumber).get("lastname");
		String Address = testData.get(rowNumber).get("Address");
		String city = testData.get(rowNumber).get("city");
		String state = testData.get(rowNumber).get("state");
		String zipcode = testData.get(rowNumber).get("zipcode");
		String phoneno = testData.get(rowNumber).get("phoneno");
		String SSN = testData.get(rowNumber).get("SSN");
		String username = testData.get(rowNumber).get("username");
		String password = testData.get(rowNumber).get("password");
		String confirm = testData.get(rowNumber).get("confirm");
		
		Random random = new Random();
		int rand_int1 = random.nextInt(100000);
		String username_new=username+rand_int1;
		

		registrationPage.enterfirstname(firstname);
		registrationPage.enterlastName(lastname);
		registrationPage.enterAddress(Address);
		registrationPage.enterCity(city);
		registrationPage.enterState(state);
		registrationPage.enterZipcode(zipcode);
		registrationPage.enterPhoneNumber(phoneno);
		registrationPage.enterSsn(SSN);
		registrationPage.enterUsername(username_new);
		registrationPage.enterPassword(password);
		registrationPage.enterConfirm(confirm);

	}

	@When("user clicks on Register button")
	public void user_clicks_on_Register_button() throws InterruptedException {
		registrationPage.clickOnRegister();

			Thread.sleep(5000000);

	}


	@Then("Verify the username retrieve the same")
	public void verifyTheUsernameRetrieveTheSame() {
		String username=registrationPage.getusernameafterLogin();
		System.out.println("username is :"+username);
	}
}
