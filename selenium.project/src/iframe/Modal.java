package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	driver.get("https://www.agoda.com/en-in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
	
	
}
}
