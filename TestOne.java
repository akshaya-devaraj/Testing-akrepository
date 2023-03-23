package com.selenium.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestOne {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		WebElement rname=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		rname.sendKeys("Akshaya");
		WebElement remail=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
		remail.sendKeys("akshaya@gmail.com");
		WebElement name=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
		name.sendKeys("achu");
		WebElement mail=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
		mail.sendKeys("achu@gmail.com");
		WebElement message=driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
		message.sendKeys("Display");
		WebElement amount=driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
		amount.sendKeys("0000");
		driver.navigate().back();
		driver.close();
		
        
	}

}
