import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertHandlingInSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input#alert1")).click();
		
		/*driver.findElement(By.cssSelector("input#prompt")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("codemind technology");
		Thread.sleep(3000);
		alert.accept();
		driver.close();*/
		
		/*driver.findElement(By.cssSelector("input#confirm")).click();
		Alert alert2=driver.switchTo().alert();
		System.out.println(alert2.getText());
		Thread.sleep(3000);
		alert2.dismiss();
		driver.close();*/
		
		driver.findElement(By.cssSelector("input#confirm")).click();
		Alert alert3=driver.switchTo().alert();
		System.out.println(alert3.getText());
		Thread.sleep(3000);
		alert3.accept();
		driver.close();
		
	}

}
