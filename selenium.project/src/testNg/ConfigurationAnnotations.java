package testNg;

import org.openqa.selenium.devtools.v115.network.model.ReportingApiEndpointsChangedForOrigin;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
@BeforeSuite
public void beforeSuit() {
	Reporter.log("@BeforeSuit",true);
}
@BeforeTest
public void beforeTest() {
	Reporter.log("@BeforeTest",true);
}
@BeforeClass
public void beforeClass() {
	Reporter.log("@BeforeClass",true);
}
@BeforeMethod
public void beforeMethod() {
	Reporter.log("@BeforeMethod",true);
}
@Test
public void demo() {
	Reporter.log("@Test(demo)executed",true);
}
@AfterMethod
public void afterMethod() {
	Reporter.log("@AfterMethod",true);
}
@AfterClass
public void afterClass() {
	Reporter.log("@AfterClass",true);
}
@AfterTest
public void afterTest() {
	Reporter.log("@AfterTest",true);
}
@AfterSuite
public void afterSuit() {
	Reporter.log("@AfterSuit",true);
}
}
