package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/dropdowns");
		WebElement dropdown = driver.findElement(By.id("fruits"));
		
		Select s = new Select(dropdown);
		
		s.selectByIndex(4);


	}

}
