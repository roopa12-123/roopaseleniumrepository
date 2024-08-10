import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeREC
{
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	/*driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
	System.out.println("===before sending data===");
	System.out.println(loginButton.isDisplayed());
	System.out.println(loginButton.isEnabled());
	
	driver.findElement(By.name("username")).sendKeys("selenium");
	driver.findElement(By.name("password")).sendKeys("password");
	loginButton.click();*/
	driver.get("https://demoapp.skillrary.com/");
WebElement	Checkbox=driver.findElement(By.xpath("//input[@class='form-control']"));
	System.out.println(Checkbox.isDisplayed());
	System.out.println(Checkbox.isEnabled());
	
}
}
