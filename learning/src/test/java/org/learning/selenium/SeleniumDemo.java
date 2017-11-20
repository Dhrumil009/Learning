package org.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		WebDriver driver;
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dmunshi\\Documents\\FinalProject\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmunshi\\Documents\\FinalProject\\chromedriver.exe");

		driver =new ChromeDriver();
		
		
//		driver.get("http://demoqa.com/frames-and-windows/");

		driver.get("https://www.google.com/");
		 
		//Send data
		driver.findElement(By.id("lst-ib")).sendKeys("Dhrumil Munshi");
		 
		// Perform event
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);;
 

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();

	}

}
