package pratice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ZkDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zkoss.org/zkdemo/input");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.linkText("Form Sample")).click();
		driver.findElement(By.id("wBzQi")).sendKeys("surendra");
		
		driver.findElement(By.id("wBzQn")).sendKeys("Surendra@577");
	
		driver.findElement(By.id("wBzQu")).sendKeys("Surendra@577");
		driver.findElement(By.id("wBzQ10")).sendKeys("24");
		driver.findElement(By.id("wBzQ80")).sendKeys("9492257477");
		driver.findElement(By.id("wBzQf0")).sendKeys("50");
		driver.close();
		
	}

}
