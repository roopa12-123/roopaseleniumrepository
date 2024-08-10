package WebElementMethods;

public class ToLearnDisplayed

{
public static void main(String[]args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread sleep(2000);
	WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
	System.out.println("===before sending data===");
	System.out.println("loginButton.isDisplayed()");
	System.out.println("loginButton.isEnabled()");
	
   driver.fin
	
}

}
}
