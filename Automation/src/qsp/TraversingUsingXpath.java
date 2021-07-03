package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingUsingXpath {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		String res = driver.findElement(By.xpath("//td[text()='Java']/../td[2]")).getText();
		System.out.println(res);
		String res1 = driver.findElement(By.xpath("//td[.='Ruby']/../td[6]/a")).getText();
		System.out.println(res1);
		String res2 = driver.findElement(By.xpath("//td[.='Python']/../td[3]")).getText();
		System.out.println(res2);
		driver.close();
	}

}
