package selenium.programs.demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonEx {
public static void main (String[]args) throws InterruptedException{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/b?node=1968024031");
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
}
}
