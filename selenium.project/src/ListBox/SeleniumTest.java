package ListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		WebElement frameElement=driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("regEmail")).sendKeys("987654321");
		
		
		WebElement r = driver.findElement(By.id("regUser"));
		r.click();
		System.out.println(driver.findElement(By.id("errorMob")).getText());
		
		
//		System.out.println(r.getText());
	

	}

}
