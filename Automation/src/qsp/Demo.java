package qsp;

import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
	}
	
	public static void task(WebDriver driver) throws InterruptedException {
		driver.navigate().to("https://google.co.in/");
		
		String title=driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(currentUrl);
		Thread.sleep(3000);
		driver.get("https://gmail.com");
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
		String title1=driver.getTitle();
		System.out.println(title1);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	    
		driver.close();
		/*JavascriptExecutor j;
		TakesScreenshot t;
		WebElement we; */
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Browser Name : ");
		String browserName = sc.nextLine();
		
		if(browserName.equals("chrome")) {
			WebDriver driver=new ChromeDriver();
			task(driver);
		}else if(browserName.equals("firefox")) {
			WebDriver driver = new FirefoxDriver();
			task(driver);
		}else if(browserName.equals("ie")) {
			WebDriver driver = new InternetExplorerDriver();
			task(driver);
		}else {
			System.out.println("You entered wrong browser name.");
		}
		
		
		sc.close();
		
	
	}

}
