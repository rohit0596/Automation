package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionsWithoutDuplicates {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/lenovo/Desktop/Dropdown.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListbox);
		List<WebElement> alloptions = s.getOptions();
		ArrayList<String> optarr = new ArrayList<String>();
		for (int i = 0;i < alloptions.size(); i++) {
			optarr.add(alloptions.get(i).getText());
		}
		Collections.sort(optarr);
		for (int i = 0; i < optarr.size(); i++) {
			System.out.println(optarr.get(i));
		}
		driver.close();
	}

}
