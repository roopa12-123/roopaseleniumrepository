package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxes {
public static void main(String[]args) {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/roopa%20k/Desktop/movie.html");
String collection = driver.findElement(By.xpath("//td[contains(text(),'pushpa')]/following-sibling::td[1]")).getText();
System.out.println("imbd of pushpa:"+ collection );

}
}
