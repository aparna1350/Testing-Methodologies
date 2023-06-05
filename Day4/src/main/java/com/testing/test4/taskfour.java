package com.testing.test4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class taskfour {
	public static void main( String[] args )throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url="https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        ///first name
        driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Aparna");
        ///last name
        driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("727821tuee004@gmail.com");
        //email
        driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("apar");
        //password
        driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("Aparnask@gmail.com");
        //to scroll
        JavascriptExecutor js =( JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,8000)", "");
        driver.findElement(By.xpath("//*[@id=\"input-theme-6\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("good");
        //password
        driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("10");
        js.executeScript("window.scrollBy(0,8000)", "");
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
        Thread.sleep(5000);
        driver.quit();
	}
}
