package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoldRoyals {
@Test
public void roldroyals() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cardekho.com/cars/Rolls-Royce");
	Reporter.log("RoldRoyals launched",true);
}
}
