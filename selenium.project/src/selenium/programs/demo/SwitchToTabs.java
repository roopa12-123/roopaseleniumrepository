package selenium.programs.demo;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToTabs {
public static void main(String[]args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
String parentId = driver.getWindowHandle();
driver.findElement(By.linkText("Facebook")).click();
Set<String> allwindowIds =driver.getWindowHandles();
String child =null;
for(String id:allwindowIds)
{
	 String url = driver.switchTo().window(id).getCurrentUrl(); 
	
	if(url.contains("facebook"))
		child= id;
		 break;// it will transfer the control out of the for each loop
}
 String title = driver.getTitle();
 System.out.println(title);
 
driver.switchTo().window(parentId).close();




	
}
}
