package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.*;
public class AssignmentScroll {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.shoppersstack.com/products_page/20");
	driver.findElement( By.id("compare")).click();
	
	 Set<String> allwindowids =driver.getWindowHandles();
	 
	 for(String id: allwindowids)
	 {
	String url = driver.switchTo().window(id).getCurrentUrl();
	
	if(url.contains("amazon"))
		break;
	 }
	 
	 Actions act=new Actions(driver);
	 act.scrollByAmount(300, 700);
}}
	
