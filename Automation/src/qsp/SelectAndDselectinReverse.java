package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDselectinReverse {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Desktop/Dropdown.html");
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrList);
		List<WebElement> allOpions = s.getOptions();
		for(int i = 0; i < allOpions.size(); i++ ) {
			s.selectByIndex(i);
		}for(int i = allOpions.size()-1; i > 0 ; i-- ) {
			s.deselectByIndex(i);
		}
		Thread.sleep(2000);
		driver.close();
	}

}
