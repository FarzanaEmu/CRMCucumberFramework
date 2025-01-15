package stepDefinitions;

import com.crm.Pages.ContactPage;
import com.crm.Pages.DealsPage;
import com.crm.Pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealsStepDefinition {

	
	
	HomePage hp=new HomePage();
	ContactPage cp;
	DealsPage dp;	
		@When("User clicks the Deals button")
	public void clickDealsButton() {
			dp=hp.DealsButton();
		}
		 
		@Then("User navigate to the Deals page")
		   public void verifyDealsPage() {
			dp.verifyApplicationDeals();
		}
		
}
