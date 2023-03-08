package basicsleneiumprograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		driver.close();
	}

}
