package assignments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckRadioBtnAlignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		int x1=driver.findElement(By.cssSelector("input#email")).getLocation().getX();
		int x2=driver.findElement(By.id("passContainer")).getLocation().getX();
		System.out.println("Positions : X1 : "+ x1 +" X2 : "+ x2);
		if (x1 == x2) {
			System.out.println("Email and password TB are aligned properly ");
		}else {
			System.out.println("Email and password TB are not aligned properly ");
		}
		System.out.println("---------------------------------------------");
		boolean isEnabled = driver.findElement(By.cssSelector("button[type='submit']")).isEnabled();
		if (isEnabled) {
			System.out.println("Login Button is enabled.");
		} else {
			System.out.println("Login Button is not enabled.");
		}
		System.out.println("---------------------------------------------");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		int y1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		int y2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		int y3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY(); 
		System.out.println("Positions : Y1 : "+ y1 +" Y2 : "+ y2 +" Y3 : "+ y3);
		if (y1==y2 && y1==y3) {
			System.out.println("All three radio buttons are aligned properly");
		}else {
			System.out.println("All three radio buttons are not aligned properly");
		}
		driver.close(); 

	}

}
