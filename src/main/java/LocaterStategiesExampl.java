import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterStategiesExampl {

	public static void main(String[] args) {
	
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.google.com/");
		cd.manage().window().maximize();
		cd.navigate().to("https://omayo.blogspot.com/");
		cd.close();
		
		//By.id();
		//WebElement pageTitle = cd.findElement(By.id("header-inner"));
		//System.out.println(pageTitle.getText());

		
		
	
	}

}
