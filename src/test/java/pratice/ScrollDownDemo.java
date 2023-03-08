package pratice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDownDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		JavascriptExecutor jsx=(JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,4500)", "");
		Thread.sleep(4000);
		jsx.executeScript("window.scrollBy(0,-3500)", "");
		Thread.sleep(4000);
		
		driver.close();

	}

}
