package pratice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonClass {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.findElement(By.linkText("Mobiles")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5000));

	driver.navigate().refresh();
	Thread.sleep(5000);
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	List<WebElement> size=driver.findElements(By.xpath("//a[@tabindex='0']"));
	
	for(WebElement collection:size) {
		System.out.println("collection of size"+collection.getText());
		
	}
	driver.close();

	}

}
