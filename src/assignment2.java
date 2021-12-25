import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Ananth/Desktop/New folder (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		WebElement staticDropDown = driver.findElement(By.xpath("//div[@class='mb-4']/select[@class='bc-neutral-100 bg-transparent']"));
		Select dropdown = new Select(staticDropDown);
		dropdown.selectByIndex(1);
		
		WebElement ch=driver.findElement(By.id("Childrens"));
		Select s1 =new Select(ch);
		s1.selectByIndex(2);
		/*WebElement staticDropDown = driver.findElement(By.xpath("//div[@class='mb-4']/select[@class='bc-neutral-100 bg-transparent']"));
		Select dropdown = new Select(staticDropDown);
		dropdown.selectByIndex(1);*/
	}

}
