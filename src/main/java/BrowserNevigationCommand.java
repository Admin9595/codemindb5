import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNevigationCommand {

	public static void main(String[] args) {

		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.google.com/");
		cd.manage().window().maximize();
		cd.navigate().to("https://www.flipkart.com/");
		cd.navigate().refresh();
		cd.navigate().to("https://www.myntra.com/");
		cd.navigate().back();
		cd.close();		
	}

}
