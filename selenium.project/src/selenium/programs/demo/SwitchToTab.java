package selenium.programs.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToTab {
public static void main(String[]args)throws InterruptedException{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Facebook")).click();
	Set<String> allWindowIds=driver.getWindowHandles();
	for(String id:allWindowIds) {
		String url=driver.switchTo().window(id).getCurrentUrl();
		if(url.contains("facebook")) {
			break;
		}
	}
	String title=driver.getTitle();
	System.out.println(title);
}
}
