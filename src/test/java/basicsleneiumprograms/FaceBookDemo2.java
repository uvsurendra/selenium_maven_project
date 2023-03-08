package basicsleneiumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cs=new ChromeOptions();
		cs.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(cs);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("surendravenkat5@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Surendra@577");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.name("login")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5000));
		
		
		
	}

}
