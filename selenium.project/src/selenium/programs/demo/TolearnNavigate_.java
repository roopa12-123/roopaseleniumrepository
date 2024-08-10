package selenium.programs.demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnNavigate_ {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/watch?v=CCc-PKAO5uw");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
