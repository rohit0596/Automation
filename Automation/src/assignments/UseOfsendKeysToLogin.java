package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UseOfsendKeysToLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	

	    driver.findElement(By.xpath("//div[.='Login ']")).click();
		//Thread.sleep(5000);
		String actStr = "actiTIME - Enter Time-Track";
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Time"));
		
		String getTitle = driver.getTitle();
		System.out.println("Title is : "+getTitle);
		if(getTitle.equals(actStr)) {
			System.out.println("Successfully Login, Pass");
		}else { 
			System.out.println("Not Login, Fail");
		}
		driver.close();
		
	}

}
