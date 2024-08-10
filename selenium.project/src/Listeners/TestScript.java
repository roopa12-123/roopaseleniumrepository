package Listeners;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethods.List;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementationClass.class)

public class TestScript extends BaseListeners
{


@Test
public void login() 
{
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("Log in")).click();
	Assert.assertEquals(driver.getTitle(),"")
	Reporter.log("login page is displayed",true);
    
    
    
    
    
 
}
}
