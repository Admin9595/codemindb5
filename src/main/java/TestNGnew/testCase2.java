package TestNGnew;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testCase2 {

	@BeforeMethod(alwaysRun=true)
	public void launchBrowser {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		@Test
		public void verifymaleRadiobuttonStatus()
		{
			WebElement RadioButton=driver.findElement(By.xpath("//input[id@='radio1']"));
			assertTrue(RadioButton.isEnabled());
		}
		
		
		}

	private static void verifymaleRadiobuttonStatus() {
		// TODO Auto-generated method stub
		
	}

}
