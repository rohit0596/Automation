package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StatusOfCheckbox {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean isSelected = driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected();
		if (isSelected) {
			System.out.println("CheckBox is selected");
		}else {
			System.out.println("CheckBox is not selected");
		}
		driver.close();
	}
	
	

}
