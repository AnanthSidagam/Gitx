import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Ananth/Desktop/New folder (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles(); //parentid;childid
		Iterator<String> it= windows.iterator();
		String parentId= it.next();
		String childId= it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String emailText= driver.findElement(By.cssSelector(".im-para.red")).getText().split(" ")[4];
		System.out.println(emailText);
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailText);
	}

}
