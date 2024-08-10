package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TataMotars {
@Test
 public void tatamotars() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.tatamotors.com/");
	Reporter.log("TataMotars launched",true);
}
}
