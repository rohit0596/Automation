package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoDisplayedOrNot {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean isDisplayed = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(isDisplayed) {
			System.out.println("Logo is displayed, Pass");
		}else {
			System.out.println("Logo is not displayed, Failed");
		}
		driver.close();
	}

}
