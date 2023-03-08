package pratice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(5000);
		al.accept();
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert ai=driver.switchTo().alert();
		 Thread.sleep(5000);

        ai.dismiss();
        
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert ap=driver.switchTo().alert();
        ap.sendKeys("Anji");
        Thread.sleep(5000);
        ap.accept();
        Thread.sleep(5000);
        driver.close();
        
		

	}

}
