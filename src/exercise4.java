import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		List<WebElement> b= driver.findElements(By.tagName("a"));
		
		int sizeb=b.size();
		System.out.println(sizeb);
		
		
		for(int i=1;i<sizeb;i++)
		{
			WebElement a=b.get(i);
			String c=a.getText();
			System.out.println(c);
		}
		
		driver.close();
	
		
		
		
		

	}

}
