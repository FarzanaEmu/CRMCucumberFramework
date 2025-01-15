package stepDefinitions;

import com.crm.Pages.ContactPage;
import com.crm.Pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactStepDefinition {
HomePage hp=new HomePage();
ContactPage cp;
	
	@When("User clicks the contact button")
public void clickContactButton() {
		cp=hp.clickContactButton();
	}
	 
	@Then("User navigate to the Contact Page")
	   public void verifyContactPage() {
		cp.verifyApplicationContact();
	}
	
	@Then("User clicks the create button") 
	public void clickcreateButton() 
	{
		
		cp.clickcreateButton();
	}
	
	@Then("^User put the contactform(.*) and (.*)$")
	public void entercredentials(String firstname, String lastname) {
		cp.entertheCredentails(firstname, lastname);
	}
	
	  
	   @Then("User clicks the save button")
	   public void clicksaveButton()
	   {
		   cp.clicksaveButton();
	   }
	   
	   @Then("User click delete button")  
	   public void clickDeletebutton() throws InterruptedException 
	   {
		   cp.clickDeleteButton();
	   }
	   
	   @Then("User leaves the firstname and lastname empty")
	   public void emptycredebtials() 
	   {
		   cp.emptycredentials();
	   }
	    
	    @Then("User gets the error message")
	    public void user_should_get_a_error_massage() 
	    {
	    	cp.user_should_get_a_error_massage();
	    }
	    
	    @And("User send the Email")
	    public void sendEmail()
	    {
	    	cp.sendEmail();
	    }
	    @Then("User selects the SOcial Chanel")
	    public void SocialChanel() throws InterruptedException 
	    {
	    	cp.SocialChanel();
	    }
	   
        @Then("User put the Address")
	    public void user_put_the_address() {
	      cp.getAddress();
	    }
	    @Then("User Checks Do not call is Displayed")
	    public void user_checks_do_not_call_is_displayed() throws InterruptedException {
	       cp.donotCall();
	    }
	    @Then("User Verifys Do nor Text is Displayed")
	    public void user_verifys_do_nor_text_is_displayed() throws InterruptedException {
	        cp.donotText();
	    }
	    @Then("User Checking Do not Email is Displayed or not")
	    public void user_checking_do_not_email_is_displayed_or_not() throws InterruptedException {
	       cp.donotEmail();
	    }


  
	   
}
