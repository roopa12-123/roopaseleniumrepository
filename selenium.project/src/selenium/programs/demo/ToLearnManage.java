package selenium.programs.demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManage {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().minimize();
	driver.manage().window().fullscreen();
}
}
