package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfCheckBoxActiTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		boolean statusOfCheckBox = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(statusOfCheckBox) {
			System.out.println("CheckBox is Selected");
		}else {
			System.out.println("CheckBox is not Selected");
		}
		driver.close();
	}
}