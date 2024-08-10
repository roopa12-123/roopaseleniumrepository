package testNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass{
	@Test
	public void clickOnBooks() {
		driver.findElement(By.partialLinkText("Books")).click();
		Reporter.log("Books page is displayed",true);
	}

}
