package WebElementMethods;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearGetLocation {
public static void main(String[]args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	org.openqa.selenium.Point position=driver.findElement(By.xpath("//input[@value='Search store']")).getLocation();
	System.out.println(position.x);
	System.out.println(position.y);
	
	
}
}
