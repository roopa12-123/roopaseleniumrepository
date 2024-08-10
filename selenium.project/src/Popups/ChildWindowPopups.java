package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import iframe.SwitchToFrame;

public class ChildWindowPopups {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 
driver.get("https://www.shoppersstack.com/products_page/17");
String parentId = driver.getWindowHandle();
driver.findElement(By.id("compare")).click();


switchToWindow(driver,"amazon");
driver.close();
driver.switchTo().window(parentId);
driver.close();
}

public static void switchToWindow(WebDriver driver,String getUrl)
{
	Set<String> allwindowids = driver.getWindowHandles();
	
	for(String id:allwindowids)
	{
	String url = driver.switchTo().window(id).getCurrentUrl();
	if(url.contains(getUrl))
		break;
	}
}
}