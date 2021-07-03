package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartiPhone11Price {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 11"+Keys.ENTER);
		List<WebElement> allProd = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 11') or contains(text(),'APPLE iPhone 11')]"));
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 11') or contains(text(),'APPLE iPhone 11')]/../../div[2]/div[1]/div[1]/div[1]"));
		int count = allPrice.size();
		System.out.println(count);
		System.out.println("All Product With Price.");
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		for (int i = 0; i < count; i++) 
		{
			System.out.println(allProd.get(i).getText()+"-------------------------"+allPrice.get(i).getText());
		}
		driver.close();
	}
}