package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import com.crm.Pages.LaunchPage;
import com.crm.Pages.LoginPage;
import com.crm.TestBase.Testbase;
import com.crm.Pages.HomePage;

public class LoginStepDefinition extends Testbase{

	LaunchPage lp=new LaunchPage();
	LoginPage loginp;
	HomePage hp;

	@Given ("Application is launched")
	public void ApplicationLaunch() throws InterruptedException {
		lp.verifyUserisInApp();
	}

	@When ("User navigated to the Login page")
	public void navigateToLoginpage() throws InterruptedException  {
		loginp=	lp.clickStarthere();
	}

	@And ("User enters the userid and password")
	public void entercredentials() {
		loginp.entertheCredentails(Testbase.prop.getProperty("emailid"),Testbase.prop.getProperty("password") );
	}
	
	
	@And("User clicks Login button")
	public void  cliclloginBtn() {
		hp= loginp.cliclloginBtn();
	}


	@Then("Verify user is logged in home page")
	public void   HomePage()  {
		hp.verifyHomePage();
	}
	
}