import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterStrategiesExample {

	public static void main(String[] args) {
		
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://omayo.blogspot.com/");
		cd.manage().window().maximize();
		cd.close();
		
		//By.id()
		WebElement PageTitle= cd.findElement(By.id("header-inner"));
		System.out.println(PageTitle.getText());
		
		//By.name
		WebElement PageTitle1 =cd.findElement(By.name("Header"));
		System.out.println(PageTitle1.getTagName());
		
		//By.ClassName
		//System.out.println( cd.findElement(By.className("header-inner")).getText());
	 
		
		
		
		
		

	}

}
