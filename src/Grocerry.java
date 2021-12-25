import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Grocerry {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Ananth/Desktop/New folder (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriverWait w= new WebDriverWait(driver,5);
		
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class=' ']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
	
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div/select")).sendKeys("Ind");
		
		/*Thread.sleep(3000);
		
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}*/
		
		driver.findElement(By.cssSelector("input.chkAgree")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
	}

	private static void addItems(WebDriver driver, String[] itemsNeeded) {
		// TODO Auto-generated method stub
		int j=0;
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
			String[] name= products.get(i).getText().split("-");
			String formattedName= name[0].trim();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
		}
		
	}

}
