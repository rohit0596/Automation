package assignments;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadResumeNaukari {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		String id = "rohit.raj.0696@gmail.com";
		String pass = "Rohitraj97083#";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		//driver.findElement(By.id("block")).click();
		driver.findElement(By.xpath("(//div[@class='mTxt'])[7]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys(id);
		driver.findElement(By.xpath("//input[contains(@placeholder,'password')]")).sendKeys(pass);
		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		Actions actions = new Actions(driver);
		//WebElement target = driver.findElement(By.xpath("//div[@class='headGNBWrap']/div/ul[2]/li[2]"));
		WebElement target = driver.findElement(By.xpath("//div[.='My Naukri']"));
		actions.moveToElement(target).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='subMenu c2'])[2]/ul/li[1]/a")).click();
		File f = new File("./data/Resume_MERN_Rohit Gupta_1.pdf");
		String absulutePath = f.getAbsolutePath();
		driver.findElement(By.id("attachCV")).sendKeys(absulutePath);
		Thread.sleep(8000);
		//String msg = driver.findElement(By.xpath("//p[@class='msg']")).getText();
		//System.out.println(msg);
		Thread.sleep(3000);
		
	}

}
