package selenium.programs.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToLearnGetWindowHandles {
public static void main(String[]args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/8");
	Thread.sleep(20000);
	driver.findElement(By.id("compare")).click();
	Set<String> allWindowIds = driver.getWindowHandles();
	System.out.println(allWindowIds);
	for(String id:allWindowIds) {
		System.out.println(id);
	}
	
}
}
