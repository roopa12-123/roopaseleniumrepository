package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnPause {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.myntra.com/shop/men");
	WebElement tshirtsLink = driver.findElement(By.id("desktop-headerMount"));
Actions act = new Actions(driver);

act.moveToElement(tshirtsLink).perform();
	

	driver.findElement(By.id("desktop-headerMount")).click();
}
}
