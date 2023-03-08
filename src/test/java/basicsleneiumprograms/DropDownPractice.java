package basicsleneiumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html?m=1");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	    
	    
	   WebElement dataDrop=driver.findElement(By.id("course"));
	   
	   Select sel=new Select(dataDrop);
	   List<WebElement> collection=sel.getOptions();
	   for(WebElement eachCollection:collection) {
		   System.out.println(eachCollection.getText());
	   }
	    
	    sel.selectByIndex(3);
	    Thread.sleep(5000);
	    sel.selectByValue("java");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	    sel.selectByVisibleText("Python");
	    Thread.sleep(5000);
	    String first=sel.getFirstSelectedOption().getText();
	    System.out.println("First Selected Value"+first);
	    Thread.sleep(5000);
	    driver.close();

	}

}
