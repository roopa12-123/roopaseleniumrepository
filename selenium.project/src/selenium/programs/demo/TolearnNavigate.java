package selenium.programs.demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnNavigate {
public void main(String[]args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.youtube.com/watch?v=CCc-PKAO5uw");
Thread.sleep(2000);
driver.navigate().back();
}
}
