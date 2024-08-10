package iframe;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

import WebElementMethods.ToLearnSendKeys;

public class PromptPopups {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	
	Alert promptPopup = driver.switchTo().alert();
	promptPopup.sendKeys("Selenium students");
	String popupMsg = promptPopup.getText();
	System.out.println(popupMsg);
	promptPopup.accept();
}
}
