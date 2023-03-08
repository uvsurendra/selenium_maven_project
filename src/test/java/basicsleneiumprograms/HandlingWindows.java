package basicsleneiumprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		System.out.println("parent window id "+driver.getWindowHandles());
		Set<String> allWindowsIds =driver.getWindowHandles();
		driver.findElement(By.linkText("Click Here")).click();
		driver.close();
		
		driver.quit();
		driver.close();
		
	}

}
