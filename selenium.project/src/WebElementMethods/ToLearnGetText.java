package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetText {
public static void main(String[]args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	String error=driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
	System.out.println(error);
	if(error.contains("unsuccessfull"))
			System.out.println("error msg display");
	else
		System.out.println("error msg not displayed");
}
}
