package assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataDrivenActiTIMELoginFeture {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		FileInputStream importFile = new FileInputStream("./data/ActiTimeCommonData.property");
		Properties propFile = new Properties();
		propFile.load(importFile);
		String url = propFile.getProperty("url");
		String userName = propFile.getProperty("userName");
		String password = propFile.getProperty("password");
		String expTitle = "actiTIME - Enter Time-Track";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Enter Time"));
		
		String actualTitle = driver.getTitle();
		System.out.println("Title is "+actualTitle);
		if(actualTitle.equals(expTitle)) {
			System.out.println("Successfully Login to actiTime.");
		}else {
			System.out.println("Login Failed.");
		}
		driver.close();
		
	}
}
