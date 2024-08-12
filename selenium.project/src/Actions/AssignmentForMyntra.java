package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentForMyntra
{
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.myntra.com/");
	 WebElement mendrop = driver.findElement(By.xpath("(//a[@class=\"desktop-main\"])[1]"));
	 
	 Actions act=new Actions(driver);
	 act.moveToElement(mendrop).perform();
	 act.moveToElement(mendrop).perform();
	
	
}
}
