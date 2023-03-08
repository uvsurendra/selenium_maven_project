package basicsleneiumprograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingDown {

	public static void main(String[] args) throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  JavascriptExecutor jsx =(JavascriptExecutor)driver;
	  jsx.executeScript("window.scrollBy(0,4500)", "");
	  Thread.sleep(5000);
	  jsx.executeScript("window.scrollBy(0,-3500)", "");
	  Thread.sleep(5000);
	  //jsx.executeScript("window.scrollBy(2000,0)", "");
	  //Thread.sleep(5000);
	  //jsx.executeScript("window.scrollBy(-1500,0)", "");
	  //Thread.sleep(5000);
	  driver.close();
	  
	}

}
