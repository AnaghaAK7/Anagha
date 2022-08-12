package saucedemo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FlipkartDemo {
@Test
	public void anagha() throws InterruptedException {
		

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium-java-4.3.0\\chromedriver_win32\\chromedriver.exe");
		 
	     WebDriver driver = new ChromeDriver();
	      
	       driver.manage().window().maximize(); 
	       
	       driver.get("https://www.flipkart.com/");
	       
	       Thread.sleep(3000);
	       
	       WebElement Username = driver.findElement (By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	       
	       Username.sendKeys("anaghakapseg@gmail.com");
	       
	     
	       
	       
	       WebElement Password = driver.findElement (By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));

	       Password.sendKeys("anagha777");
	       
	      

	       
	       WebElement loginclick = driver.findElement (By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));

	       loginclick.click();
	       Thread.sleep(2000);
	       
	       WebElement dropDown = driver.findElement(By.xpath("//div[@class='exehdJ']"));
	       
	       dropDown.click();
	       dropDown.click();
	       
	       Select s = new Select (dropDown);
	       
	       s.selectByIndex(9);
	       
	       
	       
	       
	}

}
