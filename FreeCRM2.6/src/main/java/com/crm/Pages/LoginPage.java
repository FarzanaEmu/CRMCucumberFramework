package com.crm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.TestBase.Testbase;

public class LoginPage extends Testbase{

	

	
	public void entertheCredentails(String username, String password) {
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	}
	
	public HomePage  cliclloginBtn()
	{
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();	
		return new HomePage();
	}
	
	
}
