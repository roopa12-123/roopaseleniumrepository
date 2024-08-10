package CrossBrowser;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;



public class CrossBrowserTesting {
public WebDriver driver;
@Parameters("browser")

@Test
public void launch(String browserName) {
	
	if (browserName.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}else if (browserName.equalsIgnoreCase("firefox"))	{
		driver=new ChromeDriver();
	}else if (browserName.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();

	}
	driver.get("https://demowebshop.tricentis.com/");
}
}
