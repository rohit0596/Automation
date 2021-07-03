package assignments;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutoSuggetion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = "https://www.google.co.in/";
		driver.get(url);
		
		//WebDriver driver = new ChromeDriver();
		//String url = "https://www.google.co.in/";
		int counter = 0;
		while(counter<= 3) {
			System.out.println("Enter the text : ");
			String input = sc.nextLine();
			sc.close();
			driver.findElement(By.name("q")).sendKeys(input);
			Thread.sleep(2000);
			List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(.,input)]"));
			int count = allSugg.size();
			System.out.println(count);
			for (WebElement we : allSugg) {
				System.out.println(we.getText());
			}
			counter+=1;
			
		}
	}

}
