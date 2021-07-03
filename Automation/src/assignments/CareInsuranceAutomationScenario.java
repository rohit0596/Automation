package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsuranceAutomationScenario {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement monthLB = driver.findElement(By.className("ui-datepicker-month"));
		Select sMonth = new Select(monthLB);
		sMonth.selectByIndex(6);
		WebElement yearLB = driver.findElement(By.className("ui-datepicker-year"));
		Select sYear = new Select(yearLB);
		sYear.selectByValue("1997");
		driver.findElement(By.linkText("5")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845698456");
		driver.findElement(By.id("renew_policy_submit")).click();
		String errorMsg = driver.findElement(By.id("policynumberError")).getText();
		System.out.println(errorMsg);
		driver.close();
	}

}
