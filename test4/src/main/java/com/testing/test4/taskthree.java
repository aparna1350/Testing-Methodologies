package com.testing.test4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class taskthree {
	public static void main( String[] args )
	{
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url="https://demo.opencart.com/";
		//Launchig the url
		driver.navigate().to(url);
        driver.manage().window().maximize();
        ///first name
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
	}
}
