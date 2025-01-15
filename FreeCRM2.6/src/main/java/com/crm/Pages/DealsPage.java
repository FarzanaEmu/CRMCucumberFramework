package com.crm.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.TestBase.Testbase;

public class DealsPage extends Testbase{

	
	public void verifyApplicationDeals() {
		
		
		WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Deals']")));
}}
