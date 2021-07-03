package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutoSuggetionGoogle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.google.co.in/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("java");
		//Thread.sleep(3000);
		
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(.,'java')]"));
		int count = allSugg.size();
		System.out.println(count);
		for (WebElement we : allSugg) {
			System.out.println(we.getText());
		}
		driver.close();

	}

}
