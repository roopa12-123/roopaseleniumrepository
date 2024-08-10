package selenium.programs.demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSource {
public static void main(String[] args)
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String source=driver.getPageSource();
	System.out.println(source);
	
}
}
