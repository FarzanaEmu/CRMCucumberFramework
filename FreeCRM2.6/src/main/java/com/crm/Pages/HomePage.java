package com.crm.Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.TestBase.Testbase;

public class HomePage extends Testbase{
	
	public void verifyHomePage() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/home']")));
		Assert.assertTrue(driver.getTitle().contains("Cogmento CRM"));
	}

	
	public ContactPage clickContactButton()
	{
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		return new ContactPage();
		
	}
	
	public DealsPage DealsButton()
	{
		driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
		return new DealsPage();
		
	}
	
	
	
}
