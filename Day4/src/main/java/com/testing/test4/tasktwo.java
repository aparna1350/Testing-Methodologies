package com.testing.test4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tasktwo {
	public static void main( String[] args )throws InterruptedException
    {
WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		String url="https://demo.opencart.com/";
		//Launchig the url
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("search"));
		search.sendKeys("mobiles");
		Thread.sleep(2000);
		//to scroll down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3800)", "");
		Thread.sleep(3000);
		//returns 
		js.executeScript("window.scrollBy(0,3800)", "");
          WebElement returns =driver.findElement(By.linkText("Returns"));
		  returns.click();
		  Thread.sleep(3000);
		  driver.navigate().back();
		  Thread.sleep(5000);
		  WebElement gift =driver.findElement(By.partialLinkText("Gift"));
		  gift.click();
		  Thread.sleep(3000);
		  driver.navigate().back();
		  Thread.sleep(5000);
		  driver.quit();
    }
}
