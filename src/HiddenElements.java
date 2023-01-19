import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("hide-textbox")).click();  // hide button is clicked
		
		//driver.findElement(By.id("displayed-text")).sendKeys("Lokesh");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript ("document.getElementById('displayed-text').value='Lokesh loki';");
		
	}

}
