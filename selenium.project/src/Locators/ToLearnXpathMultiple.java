package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathMultiple{
	public static void main (String[]args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//input[@data-val-required='First name is required.' and @id='FirstName']")).sendKeys("asdfghj");
	}
}
