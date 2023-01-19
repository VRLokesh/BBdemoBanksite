import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
		Thread.sleep(4000);
		
		Alert alt = driver.switchTo().alert();
		
		String alertmessage=driver.switchTo().alert().getText();
		
		System.out.println(alertmessage);

		
		alt.dismiss();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Thread.sleep(4000);
		
		Alert alr=driver.switchTo().alert();
		Thread.sleep(4000);
		
		alr.sendKeys("lokesh");
		alr.accept();
		Thread.sleep(4000);
		
		driver.close();
		

	}

}
