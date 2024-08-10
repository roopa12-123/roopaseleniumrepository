package Pom;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	driver.get("https://demoapp.skillrary.com/");
	SkillRaryPage skp=new SkillRaryPage(driver);
	skp.getSearchTF().sendKeys("SELENIUM",Keys.ENTER);
	skp.getSearchTF().sendKeys("testng",Keys.ENTER);
}
}

