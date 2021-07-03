package assignments;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllChildBrowserClosedOpenedByNaukri {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> allWin = driver.getWindowHandles();
		Iterator<String> itr = allWin.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			driver.switchTo().window(string);
			driver.close();
		}
		System.out.println("All browser window was closed successfully which is opened by naukri.com.");
	}

}
