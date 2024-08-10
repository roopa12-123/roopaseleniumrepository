package ListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.webaudio.WebAudio;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelectListbox {
public static void main (String[]args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapp.skillrary.com/");
	WebElement Pricelist=driver.findElement(By.id("cars"));
	Select price=new Select(Pricelist);
	price.selectByIndex(1);
	price.selectByValue("199");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
