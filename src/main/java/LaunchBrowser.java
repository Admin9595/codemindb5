import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriver WebDriver = new ChromeDriver();
		
		WebDriver.get("https://www.google.com");
		
		WebDriver.manage().window().maximize();
		
		WebDriver.close();		
		

	}

}
