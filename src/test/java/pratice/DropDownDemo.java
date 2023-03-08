package pratice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html?m=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement drop= driver.findElement(By.id("course"));
		
		
		Select sel=new Select(drop);
		List<WebElement> collection=sel.getOptions();
		for(WebElement eachcollection:collection) {
			System.out.println("collection of size "+ eachcollection.getText());
		}
		sel.selectByIndex(2);
		Thread.sleep(5000);
		
		sel.selectByValue("python");
		Thread.sleep(5000);
		
		sel.selectByVisibleText("Javascript");
		Thread.sleep(5000);
		
		driver.close();
	
		
		

	}

}
