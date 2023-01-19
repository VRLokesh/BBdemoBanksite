import javax.lang.model.element.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pmsmart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vr.lokesh\\Downloads\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://pmsstg.hcl.com/pmsmart/Request?Key=login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("loginId")).sendKeys("jananaayagan.v");
		driver.findElement(By.id("password")).sendKeys("Vickyshachin@20");
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.id("closebutn")).click();
		
		//String actualText = driver.findElement(By.xpath("//*[@id=\"IconBar\"]/tbody/tr/td")).getText();
		//String expectedText = "Welcome To PM Smart : Jananaayagan V";
		
		//Assert.
		
		
		
		driver.findElement(By.id("LOCK_Projects")).click();
	    
		
		
	}

}
