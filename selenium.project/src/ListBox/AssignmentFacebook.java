package ListBox;
import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFacebook {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		WebElement years = driver.findElement(By.id("year"));
		Select allyear=new Select(years);

		
		
		List<WebElement> alloption = allyear.getOptions();
	
		
		int size = alloption.size();
              allyear.selectByIndex(size-1);
		
		
}
}
