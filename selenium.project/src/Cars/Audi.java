package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Audi {
@Test
public void audi() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.audi.in/in/web/en.html");
	Reporter.log("Audi launched",true);
}
}
