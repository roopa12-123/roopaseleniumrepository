package ListBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement pricelistbox = driver.findElement(By.id("cars"));
		Select priceSelect=new Select(pricelistbox);
		priceSelect.selectByIndex(0);
		priceSelect.selectByIndex(1);
		priceSelect.selectByIndex(2);
		  
		//Thread.sleep(2000);
		//priceSelect.deselectByIndex(0);
		//Thread.sleep(2000);
		//priceSelect.deselectByIndex(2);
		//Thread.sleep(2000);
		//priceSelect.deselectByIndex(1);
		
	//TO LEARN FIRST SELECTED OPTION	
		//WebElement firstSelected = priceSelect.getFirstSelectedOption();
		//System.out.println(firstSelected);//FROM THIS YOU WILL GET THE ADDRESS
		//System.out.println(firstSelected.getText());// HERE IF U CALL GET TEXT THEN U WILL GET THE TEXT PRESENT IN FIRST OPTION
		
		//TO LEARN ALL SELECTED OPTIONS
		
		List<WebElement> allSelected = priceSelect.getAllSelectedOptions();
		System.out.println(allSelected.size());
		
		for(WebElement option:allSelected) {
			System.out.println(option.getText());
		}

	}

}
