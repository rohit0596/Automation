package qsp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class CheckURL {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://google.co.in/");

		String title=driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(title);

		if(title.equals("Google")) {
			System.out.println("Title is \"Google\"");
		}else {
			System.out.println("Title is not matching");
		}
		System.out.println(currentUrl);
		if(currentUrl.contains(".co.in") && currentUrl.equals("https://www.google.co.in/")) {
			System.out.println("It's nevigating to \"google.co.in\"");
		}else {
			System.out.println("It's not nevigating to \"google.co.in\"");
		}
		driver.quit();

	}

}


