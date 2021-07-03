package assignments;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionsInAlphabaticOrder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/lenovo/Desktop/Dropdown.html");
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrList);
		List<WebElement> allOptions = s.getOptions();
		Set<String> orderedList = new TreeSet<String>();
		for(int i = 0; i < allOptions.size(); i++) {
			orderedList.add(allOptions.get(i).getText());
		}
		Iterator<String> itr = orderedList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		driver.close();
	}
}
