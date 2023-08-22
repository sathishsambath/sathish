package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement loginoption = driver.findElement(By.className("ico-login"));
		
		loginoption.click();
		
		WebElement emailtextbox = driver.findElement(By.className("email"));
		
		emailtextbox.sendKeys("sathish");
		

	}

}
