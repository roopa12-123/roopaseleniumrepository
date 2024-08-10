package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

public class NotificationPopup {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();

	//options.addArguments("--disable-notifications ");
	options.addArguments("--incognito");
	options.addArguments("--start-maximized");
	 
	WebDriver driver=new ChromeDriver(options);
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.redbus.in/");
}
}
