package basicsleneiumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.id("email")).sendKeys("venkatsurendra5@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Surendra@577");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		

	}

}
