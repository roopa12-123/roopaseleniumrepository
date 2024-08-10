package selenium.programs.demo;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		Point position = driver.manage().window().getPosition();
		System.out.println(position);
	}

}
