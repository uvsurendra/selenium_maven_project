package basicsleneiumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFilePractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5000));
		driver.findElement(By.linkText("File Upload")).click();
		WebElement chooseFile=driver.findElement(By.id("file-upload"));
		Thread.sleep(5000);
		chooseFile.sendKeys("D:\\Surendra Details\\Surendra_CV.pdf");
		driver.findElement(By.id("file-submit")).click();
		
		

	}

}
