import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandelingFrameAndAlerts {

	public static void main(String[] args) {
		WebDriver driver =new EdgeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//Switch to frame by index
		//driver.switchTo().frame(0);
		//driver.findElement(By.cssSelector("a#b-getorpost")).click();
		
		//Switch to frame by Name Attribute 
		//driver.switchTo().frame("navbar-iframe");
		//driver.findElement(By.cssSelector("a#b-getorpost")).click();
		
		//Switch to frame by id Attribute
		//driver.switchTo().frame("navbar-iframe");
		//driver.findElement(By.cssSelector("a#b-getorpost")).click();
		
		//switch to frame by Web Element
		WebElement frame=driver.findElement(By.cssSelector("iframe#navbar-iframe"));
		driver.switchTo().frame(frame);
		
		//driver.findElement(By.cssSelector("a#b-getorpost")).click();
		System.out.println(driver.findElement(By.cssSelector("a#b-getorpost")).getText());
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//h1[@class='title']")).getText());
	}

}
