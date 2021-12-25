import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Ananth/Desktop/New folder (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.tagName("a")).click();
		driver.findElement(By.cssSelector("input off")).sendKeys("ananth.sidgam@gmail.com");
		//driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU")).sendKeys("prince123");
		//driver.findElement(By.linkText("Login")).click();
	
	
	}

}
