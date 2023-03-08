package practicesession;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html?m=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement dropDown=driver.findElement(By.id("course"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2500)", "");
		Thread.sleep(5000);
		Select sel=new Select(dropDown);
		sel.selectByIndex(2);
		Thread.sleep(5000);
		sel.selectByValue("js");
		Thread.sleep(5000);
		sel.selectByVisibleText("Python");
		Thread.sleep(5000);
		
		List<WebElement> collection= sel.getOptions();
		for(WebElement eachCollection:collection) {
			System.out.println(eachCollection.getText());
			
		}
		driver.close();
		
		
		
	
	

	}

}
