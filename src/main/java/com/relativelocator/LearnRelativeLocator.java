package com.relativelocator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnRelativeLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 driver.get("https://www.automationwithpiyush.com/relative.html");
		 Thread.sleep(3000);
		
		 WebElement reference = driver.findElement(By.id("center_monitor")); 
		 
		 driver.findElement(
					with(By.tagName("button"))
					.above(reference)				
				).click();
		 
		
		 driver.findElement(
					with(By.tagName("button"))
					.toLeftOf(By.tagName("span"))
					.above(reference)				
				).click();
		 Thread.sleep(3000);
		 Thread.sleep(30);
		 driver.quit();
	}
}
