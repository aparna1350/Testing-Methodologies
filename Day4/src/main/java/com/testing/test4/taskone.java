package com.testing.test4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class taskone {

    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        ///first name
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Aparna");
        ///last name
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("M K");
        //email
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("727821tuee004@skct.edu.in");
        //password
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Aparnask@143");
        //to scroll
        JavascriptExecutor js =( JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3500)", "");
        // subscribe --> click yes or No
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
    }
}
