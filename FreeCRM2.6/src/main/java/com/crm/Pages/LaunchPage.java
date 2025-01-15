package com.crm.Pages;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.crm.TestBase.Testbase;

public class LaunchPage extends Testbase{
	
	
	
	
public void verifyUserisInApp() throws InterruptedException {
		
	Assert.assertTrue(driver.getTitle().contains("Free CRM"));
		
	}

	
	
	public LoginPage clickStarthere() throws InterruptedException {
	
		//Thread.sleep(4000);
		//WebElement button=driver.findElement(By.xpath("(//div[contains(@class, 'MuiBox-root')]//button[@type='button'])[1]"));
		//button.click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//p[contains(text(),'English (US)')]")).click();
		
		Thread.sleep(5000);
		
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		link.click();
	Set<String> bothwindow=	driver.getWindowHandles();
		
	     System.out.println(bothwindow);
	   String  parentwindow= driver.getWindowHandle();
	   System.out.println(parentwindow);
	   
	   for(String handle : bothwindow )
	   {
		   if(!(handle == parentwindow ))
		   {
			   driver.switchTo().window(handle);
		   }
		   
	   }
		
		
		return new LoginPage();
	}
	
	

}
