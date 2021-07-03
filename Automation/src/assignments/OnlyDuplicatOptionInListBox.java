package assignments;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlyDuplicatOptionInListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/lenovo/Desktop/Dropdown.html");
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select slist = new Select(mtrList);
		 List<WebElement> allOption = slist.getOptions();
		 Set<String> s = new HashSet<String>();
		 for(int i = 0; i<  allOption.size(); i++ ) {
			 if(s.add(allOption.get(i).getText())) {
				 
			 }else {
				 System.out.println("Duplicate option is "+allOption.get(i).getText());
			 }
			 	
		 }
	}

}
