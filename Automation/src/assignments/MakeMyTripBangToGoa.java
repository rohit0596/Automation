package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripBangToGoa {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		//driver.navigate().refresh();
		driver.findElement(By.xpath("//li[@data-cy='oneWayTrip'")).click();
		Thread.sleep(2000);
		
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(1000);
		List<WebElement> dateList = driver.findElements(By.xpath("//div[contains(text(),'June')]/../../div[3]/div/div[@class='DayPicker-Day']"));
		for (WebElement webElement : dateList) {
			String str = webElement.getText();
			
			if(str.contains("5")) {
				System.out.println(str);
				webElement.click();
			}
			System.out.println(str);
			System.out.println("Date not found.");
		}
		Thread.sleep(10000);
		driver.findElement(By.xpath("//label[@for='fromCity']/input")).click();
		
		driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin']/div/input")).sendKeys("Bangalore");

		Thread.sleep(3000);
		List<WebElement> fromAutoSugg = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
		for (WebElement fromExpecLoc : fromAutoSugg) {
			if(fromExpecLoc.getText().contains("Bangalore") || fromExpecLoc.getText().contains("Bengaluru")) {
				fromExpecLoc.click();
				break;
			}

		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='toCity']/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin']/div/input")).sendKeys("Goa");

		Thread.sleep(3000);
		List<WebElement> toAutoSugg = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
		for (int i = 0; i < toAutoSugg.size(); i++) {
			String str = toAutoSugg.get(i).getText();
			if(str.contains("Goa")) {
				toAutoSugg.get(i).click();
			}
			
		}	
		
		driver.findElement(By.className("primaryBtn font24 latoBold widgetSearchBtn ")).click();
	}
}
