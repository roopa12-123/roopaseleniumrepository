package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		//step1: create FileInputStream object
		FileInputStream fis=new FileInputStream("./TestData/commondata.properties");
		
		//step2:create Respective file type object
		Properties prop=new Properties();
		
		//step3: call read methods
		prop.load(fis);
		String url = prop.getProperty("url");
		String email = prop.getProperty("email");
		System.out.println(url);
		System.out.println(email);
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
driver.findElement(By.name("username")).sendKeys("roopakotakonda@gmail.com");
driver.findElement(By.name("password")).sendKeys("doremon");
	}

}
