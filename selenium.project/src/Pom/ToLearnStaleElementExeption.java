package Pom;

import java.time.Duration;

import javax.naming.directory.DirContext;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnStaleElementExeption {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		driver.get("https://demoapp.skillrary.com/");
		WebElement searchTF = driver.findElement(By.id("navbar-search-input"));
	        searchTF.sendKeys("selenium",Keys.ENTER);
	        searchTF.sendKeys("testng");
	        
	}

}
