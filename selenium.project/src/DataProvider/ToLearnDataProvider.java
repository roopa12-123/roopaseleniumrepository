package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.netty.util.AsciiString;

public class ToLearnDataProvider {
@DataProvider
public String[][] dataSender(){
	String data[][]= {
			{"admin","admin"},
			{"user","user"},
			{"abhis@gmail.com","abhi@123"}
	};
	return data;
	}
	@Test(dataProvider = "dataSender")
	public void login(String[] cred) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(cred[0]);
		driver.findElement(By.id("Password")).sendKeys(cred[1]);
	}
}

