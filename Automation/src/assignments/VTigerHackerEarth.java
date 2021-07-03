package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class VTigerHackerEarth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement resourceTab = driver.findElement(By.id("navbarDocumentation"));
		Actions a = new Actions(driver);
		a.moveToElement(resourceTab).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement btn = driver.findElement(By.linkText("READ FULL STORY"));
		a.doubleClick(btn).perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("HackerEarth"));
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("HackerEarth")) {
			System.out.println("Test Case is Passed");
		}else{
			System.out.println("failed");
		}
		driver.close();
		
	}
}
