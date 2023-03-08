package pratice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String str=driver.getWindowHandle();
		System.out.println("parent window "+str);
		driver.findElement(By.id("newWindowBtn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		Set<String> handles=driver.getWindowHandles();
		for(String handle:handles) {
			System.out.println(handle);
			if(!handle.equals(str)) {
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("Surendra");
				Thread.sleep(5000);
				
			}
		}
		driver.switchTo().window(str);
		driver.findElement(By.id("name")).sendKeys("Suri");
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
