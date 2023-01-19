import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapInSelenium {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lmax.com/global/demo-login");
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("username")).sendKeys("Lokesh123");
		//driver.findElement(By.name("password")).sendKeys("loki@123");
		
		System.out.println(getcredentialsMap() );
		//System.out.println(getcredentialsMap().get("customer"));
		
		driver.findElement(By.name("username")).sendKeys(getUserName("customer"));
		driver.findElement(By.name("password")).sendKeys(getPassword("customer"));
		
		
	}
	
	public static HashMap<String,String> getcredentialsMap() 
	{
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("customer", "Lokesh123:loki@123");
		map.put("Manager", "Sachin:SAchin@12");
		map.put("distributor", "suresh:54763");
		map.put("seller", "hemanth:998765");
		
		return map;
	}
	
	public static String getUserName(String role) {
		String credentials=getcredentialsMap().get(role);
		return credentials.split(":")[0];
	}
		
	public static String getPassword(String role) {
		String credentials=getcredentialsMap().get(role);
		return credentials.split(":")[1];
		
		
	}
	
}
		
		
		

	


