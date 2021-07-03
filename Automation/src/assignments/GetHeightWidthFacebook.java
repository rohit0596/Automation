package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHeightWidthFacebook {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension emailTBSize = driver.findElement(By.id("email")).getSize();
		Dimension passTBSize = driver.findElement(By.id("pass")).getSize();
		int heightT = emailTBSize.getHeight();
		int widthT =emailTBSize.getWidth();
		int heightP =passTBSize.getHeight();
		int widthP = passTBSize.getWidth();
		
		System.out.println(widthT);
		System.out.println(heightP);
		System.out.println(widthP);
		
		if(heightT == heightP && widthT == widthP) {
			System.out.println("Height and width are same size, Pass");		
		}else {
			System.out.println("Height and width are not same, Fail");
		}
		System.out.println("Email TB : Height = "+heightT +"Width = "+widthT);
		System.out.println("Pass TB : Height = "+heightP +"Width = "+widthP);
	}
}
