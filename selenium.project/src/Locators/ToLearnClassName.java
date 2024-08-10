package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClassName {
public static void main(String[]args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Log in")).click();
driver.findElement(By.id("Email")).sendKeys("roopa12@gmail.com");
driver.findElement(By.id("Password")).sendKeys("66554488");
	driver.findElement(By.className("login-button")).click();
}
}
