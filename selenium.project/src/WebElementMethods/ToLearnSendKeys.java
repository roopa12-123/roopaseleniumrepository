package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSendKeys {
public static void main(String[]args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://demowebshop.tricentis.com/");
	//driver.findElement(By.id("small-searchterms")).sendKeys("mobiles",Keys.ENTER);
	driver.get("https://www.myntra.com/");
	driver.findElement(By.xpath("//input[contains(@placeholder,' products, brands and more')]")).sendKeys("slingbags",Keys.ENTER);
	
}
}
