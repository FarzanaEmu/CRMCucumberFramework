package com.crm.Pages;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.crm.TestBase.Testbase;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ContactPage extends Testbase{
	
	public void verifyApplicationContact() {
		System.out.println();
	
		WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Contacts']")));
	}

	
	public void clickcreateButton() {
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
		
	}


	public void entertheCredentails(String firstname, String lastname) {
	
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
		
	}


	public void clicksaveButton() {
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();}


	public HomePage clickDeleteButton() throws InterruptedException {
	   Thread.sleep(4000);
		driver.findElement(By.xpath("//i[@class='trash icon']")).click();
		
		//driver.get("https://admim:admin@ui.cogmento.com/contacts/c14aec4c-240b-457f-99c3-86ddb8878ab8");
		driver.findElement(By.xpath("//button[@class='ui red button']")).click();
		return new HomePage();
	}


	public void emptycredentials() {
		driver.findElement(By.xpath("//input[@name='first_name'] ")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("");
	}


	public void user_should_get_a_error_massage() {
		
	Boolean errormassage1= driver.findElement(By.xpath("//span[normalize-space()='The field First Name is required.']")).isDisplayed();
	Boolean errormassage2=driver.findElement(By.xpath("//span[normalize-space()='The field First Name is required.']")).isDisplayed();
	Assert.assertTrue(errormassage1);
	Assert.assertTrue(errormassage2);
	}


	public void sendEmail() {
		
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("bdemu@yahoo.com ");
	}


	public void SocialChanel() throws InterruptedException
	{
	Thread.sleep(400);	
	driver.findElement(By.xpath("//div[@name='channel_type']//i[@class='dropdown icon']")).click();
	
	Thread.sleep(400);
	driver.findElement(By.xpath("//span[normalize-space()='LinkedIn']")).click();
	

	}


	public void getAddress() {
		
		driver.findElement(By.xpath("//input[@placeholder='Street Address']")).sendKeys(" 88-05 merrick bluevard , jamiaca newyork, NY-10010");	
		
		
	}


	public void donotCall() throws InterruptedException {
//Thread.sleep(400);
		driver.findElement(By.xpath("//div[@class='ui toggle checkbox']//label[contains(text(),'Do not Call')]")).isEnabled()	;	
	}


	public void donotText() throws InterruptedException {
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//div[@class='ui toggle checkbox']//label[contains(text(),'Do not Text')]")).isEnabled()	;		
	}


	public void donotEmail() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath(" //div[@class='ui toggle checkbox']//label[contains(text(),'Do not Email')]")).isEnabled()	;	
	}
		
	
	
	}


	
		
		
	
	
		
	

	
	

	

