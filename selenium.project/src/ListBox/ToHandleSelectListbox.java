package ListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSelectListbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/books");
		WebElement sortby=driver.findElement(By.id("products-orderby"));
		 
        Select sortbyref=new Select(sortby);
        
       //sortbyref.selectByIndex(1);
        //sortbyref.selectByValue("https://demowebshop.tricentis.com/books?orderby=5");
        sortbyref.selectByVisibleText("Price: Low to High");
	}

}
