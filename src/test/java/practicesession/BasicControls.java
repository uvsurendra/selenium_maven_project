package practicesession;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicControls {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.id("firstName")).sendKeys("VenkataSurendra");
		driver.findElement(By.id("lastName")).sendKeys("Undrajavarapu");
		driver.findElement(By.id("femalerb")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5000));
		driver.findElement(By.id("malerb")).click();
		List<WebElement> collection=driver.findElements(By.className("bcCheckBox"));
		for(WebElement eachCollection:collection) {
			if(!eachCollection.isSelected()) {
				eachCollection.click();
				//System.out.println(collection.size());
			}
		}
		System.out.println(collection.size());
		driver.findElement(By.id("email")).sendKeys("venkatasurendra144@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Surendra@577");
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.close();
	}

}
