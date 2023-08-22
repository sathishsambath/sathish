package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcmd {
	
	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.className("ico-login")).click();
	WebElement emailtextbox = driver.findElement(By.className("email"));
	WebElement pass = driver.findElement(By.id("Password"));
	
	emailtextbox.sendKeys("sathish ");
	pass.sendKeys("khygviuhbvij");
	
	pass.submit();
	
	
	WebElement searchbtn = driver.findElement(By.className("search-box-button"));
	
	if (searchbtn.isDisplayed()) {
		
		searchbtn.click();
		
	} else {
		
		System.out.println("search btn not displayed");

	}
	
	
	
	
	
//	Thread.sleep(2000);
//	driver.navigate().back();
//	Thread.sleep(2000);
//	
//	driver.navigate().forward();
//	Thread.sleep(2000);
//	driver.navigate().refresh();
	
}
	
	

}
