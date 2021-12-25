import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Ananth/Desktop/New folder (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String label= driver.findElement(By.xpath("//div/fieldset/label[@for='benz']")).getText();
		System.out.println(label);
		
		WebElement staticDropDown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticDropDown);
		dropdown.selectByVisibleText(label);
		
		driver.findElement(By.id("name")).sendKeys(label);
		driver.findElement(By.id("alertbtn")).click();
		String text= driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.quit();
		if(text.contains(label))
		{
			System.out.println("Alert message contains the selected option");
		}
		else
		{
			System.out.println("Alert message doesnt contain the selected option");
		}
		
		
	}
		
}
