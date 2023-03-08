package basicsleneiumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5000));
		String title="The Internet";
		
		wait.until(ExpectedConditions.titleContains(title));
		
		driver.findElement(By.linkText("File Upload")).click();
		WebElement chooseFile=driver.findElement(By.id("file-upload"));
		Thread.sleep(3000);
		chooseFile.sendKeys("D:\\Surendra Details\\Surendra_CV.pdf");
		Thread.sleep(3000);
		driver.findElement(By.id("file-submit")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
		
	}

}
