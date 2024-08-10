package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

 public class XpathByContains {
public static void main (String[]args) {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).sendKeys("hulk123@gmail.com");
driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("99887766");
}
}
