package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lamborgini {
@Test
public void Lamborgini() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.lamborghini.com/en-en");
	Reporter.log("lamborgini launched",true);
}
}
