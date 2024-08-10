package testNg;

import java.time.Duration;

import org.checkerframework.common.util.report.qual.ReportOverride;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.network.model.ReportingApiEndpointsChangedForOrigin;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodss {
@Test(dependsOnMethods = "register")
public void login() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/login");
	
	//Assert.fail();
	Reporter.log("user logged in successfilly",true);
}
@Test
public void register() {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://demowebshop.tricentis.com/register");
//Assert.fail();
Reporter.log("user registered in successfully",true);
}
@Test(dependsOnMethods = {"register","login"})

public void addProduct()
{
Reporter.log("product is successfully added to cart");


}
}
