/**
 * 
 */
package com.hibu.hppd.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Hemalatha
 *
 */
public class PageLoadTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hibu--full01.cs15.my.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("hemalatha.bondalapati@hibu.com.full01");
		//ssusername.sendKeys("");
		//WebElement password = 
		driver.findElement(By.name("pw")).sendKeys("Hemalatha@123");
		//password.sendKeys("");
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		
		//Verification code
		
/*		driver.findElement(By.id("emc")).sendKeys("12706");
		driver.findElement(By.id("save")).click();*/
		
		// Navigating from SFDC to HPPD
		
	driver.findElement(By.name("customer_dashboard")).click();
		
		//Gary Bowers & Miller
		
		
	}

}
