import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollingInSelenium {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor javascriptExecutor= (JavascriptExecutor)driver;
		
		//Scrolling Vertically down
		javascriptExecutor.executeScript("window.scrollBy(0,1200)", "");
		
		//Thread.sleep(5000);
				
		//Scrolling Vertically up
		javascriptExecutor.executeScript("window.scrollBy(0,-1000)", "");
		
		//Scroll Horizontally right
		javascriptExecutor.executeScript("window.scrollBy(10,0)", "");
		
		//Scrolling Horizontally Left
		javascriptExecutor.executeScript("window.scrollBy(-10,0)", "");
		
		//Scrolling into View
		WebElement element=driver.findElement(By.xpath("//*[text()='Mango']")) ;
		javascriptExecutor.executeScript("arguments[0],scrollIntoView(true);", element);
		
		// Scroll till end of the page
		
		javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		WebElement link = driver.findElement(By.xpath("//a[text()='Blogger']"));

		javascriptExecutor.executeScript("arguments[0].click();", link);

		

	}

}
