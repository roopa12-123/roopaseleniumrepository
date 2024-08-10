package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeMultipleAssignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		WebElement frame1 = driver.findElement(By.name("__privateStripeMetricsController6990"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("__privateStripeMetricsController0910")).sendKeys("nobita@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345678");
		driver.findElement(By.id("cpass")).sendKeys("12345678");
		driver.findElement(By.id("firstName")).sendKeys("nobita");
		driver.findElement(By.id("lastName")).sendKeys("doremon");
		driver.findElement(By.id("phone")).sendKeys("9988776655");
       // driver.findElement(By.xpath("//input[@value='Register']")).click();
		driver.findElement(By.className("blue")).click();
	}

}
