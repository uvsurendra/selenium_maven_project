     package basicsleneiumprograms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	   
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    
	    driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
	    Alert al1= driver.switchTo().alert();
	    al1.accept();
	
	    driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
	    Alert al2= driver.switchTo().alert();
	    al2.dismiss();
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
	    Alert al3=driver.switchTo().alert();
	    Thread.sleep(10000);
	    al3.sendKeys("Surendra");
	    
	    Thread.sleep(10000);
	    
	    al3.accept();
	    Thread.sleep(10000);
	    driver.close();
	   
	   
	}

}
