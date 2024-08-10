package selenium.programs.demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentUrl {
public static void main(String [] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.flipkart.com/");
	String url=driver.getCurrentUrl();
	System.out.println(url);
	if(url.equals("	https://www.flipkart.com/"))
	{
	   System.out.println("user navigate successfully");
	}
	else
		System.out.println("user failed to navigate");
	}
}

