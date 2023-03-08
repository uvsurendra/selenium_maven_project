package basicsleneiumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zkoss.org/zkdemo/input");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Button")).submit();
		String title="ZK Live Demo - Button";
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.titleContains(title));
		WebElement frame=driver.findElement(By.id("twitter-widget-0"));
		driver.switchTo().frame(frame);
		driver.findElement(By.linkText("Tweet")).click();
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.className("text")).sendKeys("iam_surendra");
		

	}

}
