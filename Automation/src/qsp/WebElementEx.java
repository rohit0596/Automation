package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementEx {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/lenovo/Desktop/ListOfSocialNetworkingSite.html");
		/*driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		driver.findElement(By.name("n2")).click();
		driver.navigate().back();
		driver.findElement(By.className("c3")).click();;
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.id("a4")).click();
		Thread.sleep(3000); */
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		
		
		driver.close();

	}

}
