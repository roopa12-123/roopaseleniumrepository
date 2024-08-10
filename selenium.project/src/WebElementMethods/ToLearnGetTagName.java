package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTagName {
public static void main(String[]args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement( By.xpath("//input[@value='Log in']")).click();
	 String tagname = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getTagName();
	System.out.println(tagname);
}
}
