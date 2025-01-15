package com.crm.TestBase;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {


	 static protected Properties prop;
	 static protected WebDriver driver;

	public void lodProperty() throws IOException {
		prop=new Properties();
		FileInputStream fip=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
		prop.load(fip);

	}
	
	/*
	 * Create protect variable
	 *  string name  prop.get("")
	 *  string pass 
	 */

  public  void init() throws IOException
	{
		lodProperty();	
	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println(prop.get("url")+"");
		
		driver.get(prop.get("url")+"");
		}
	
	public void LaunchApp()
	{
		driver.manage().window().maximize();
	}
	
	public void CloseBrowser()
	{
		driver.quit();
	}
	
	
	
}
