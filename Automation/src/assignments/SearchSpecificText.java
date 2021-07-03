package assignments;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchSpecificText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/lenovo/Desktop/Dropdown.html");
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select selectListObj = new Select(mtrList);
		List<WebElement> dDownObj = selectListObj.getOptions();
		System.out.println("Enter the option you want to choose. : ");
		String input = sc.nextLine();
		int count = 0;
		for (WebElement we : dDownObj) {
			if (we.getText().equalsIgnoreCase(input)) {
				System.out.println("Yes this option is available. Search result is " + we.getText());
				break;
			}
			count++;		
		}
		if(count == dDownObj.size())
			System.out.println("Selected wrong. option.");
		sc.close();
		driver.close();
	}

}
