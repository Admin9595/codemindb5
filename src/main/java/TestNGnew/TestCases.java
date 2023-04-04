package TestNGnew;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {

	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void launchApplication() {

		driver = new EdgeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void testCase() {
		driver.findElement(By.xpath("input[@name='Username']")).sendKeys("Username");
		driver.findElement(By.xpath("input[@name='Password']")).sendKeys("Password");
		driver.findElement(By.xpath("input[@name='Submit']")).click();
		assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/test/newtours/login_sucess.php");
	}

}
