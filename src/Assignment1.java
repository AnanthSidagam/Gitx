import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Ananth/Desktop/New folder (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
