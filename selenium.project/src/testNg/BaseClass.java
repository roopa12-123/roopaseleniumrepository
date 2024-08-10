package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
public WebDriver driver;
@BeforeClass
public void openBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	
}
@BeforeMethod
public void login() {
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("doremon@123");
	driver.findElement(By.id("Password")).sendKeys("123456789");
	driver.findElement(By.xpath("")).click();
}
@AfterMethod
public void logout() {
	driver.findElement(By.linkText("")).click();
	
}
@AfterClass
public void closeBrowser() {
	driver.quit();
}
}
