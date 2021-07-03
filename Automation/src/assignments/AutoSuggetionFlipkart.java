package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetionFlipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
			
		driver.findElement(By.name("q")).sendKeys("iphone");
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		System.out.println(allSugg.size());
		for (WebElement we : allSugg) {
			System.out.println(we.getText());
		}
		driver.close();
	}

}
