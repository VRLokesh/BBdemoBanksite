import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vr.lokesh\\Downloads\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		int titleLength=driver.getTitle().length();
		
		System.out.print(title);
		
		System.out.print("\n "+titleLength);
		
		String actualUrl=driver.getCurrentUrl();
		
		if(actualUrl.equals("https://demowebshop.tricentis.com/login"))
		{
			System.out.print("verification successful-the correct page is opened");
		}
		else 
		{
			System.out.print("verification failed-an incorrect page is opened");
		}
		
		String pageSource=driver.getPageSource();
		
		int pageSourceLength=pageSource.length();
		
		System.out.print(pageSource);
		
		driver.close();
	}

}
