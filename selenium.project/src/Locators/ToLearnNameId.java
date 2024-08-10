package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNameId {
public static void main(String[]args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	
	driver.findElement(By.name("Gender")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Roopa");
	driver.findElement(By.id("LastName")).sendKeys("kotakonda");
	driver.findElement(By.id("Email")).sendKeys("roopa12@gmail.com");
    driver.findElement(By.id("Password")).sendKeys("66554488");
    driver.findElement(By.id("ConfirmPassword")).sendKeys("66554488");
    driver.findElement(By.id("register")).click();
}
}
