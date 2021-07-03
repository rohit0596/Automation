package practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xddf.usermodel.TileFlipMode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generics.FileLib;
import com.actitime.pom.LoginPage;

public class MainMethodCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage l = new LoginPage(driver);
		FileLib f =new FileLib();
		int rowConunt = f.getLastRowCountFromExcel();
		for(int i = 1; i <= rowConunt; i++ ) {
			String un = f.getExcelValue("loginData", i, 0);
			String pass = f.getExcelValue("loginData", i, 1);
			l.setUser(un, pass);
			
			try {
				if (driver.findElement(By.id("logoutLink")).isEnabled()) 
				driver.findElement(By.id("logoutLink")).click();
			}
			catch(Exception e) {
				System.out.println("click is not working.");
			}
		
		}
		
		
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		l.setUser("admin", "manager");
	}

}
