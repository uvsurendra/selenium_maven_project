package basicsleneiumprograms;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreebShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		TakesScreenshot tks=((TakesScreenshot)driver);
		//taking screenshot and storing one file
		File src=tks.getScreenshotAs(OutputType.FILE);
		System.out.println(System.getProperty("user.dir"));
		//ccpying screenshot to out project
	    FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//src//test//img.png"));
		
		//WebElement helloElement=driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]"));
		//TakesScreenshot tkw=((TakesScreenshot)helloElement);
		//taking screenshot and storing one file
		//File src1=tkw.getScreenshotAs(OutputType.FILE);
		//System.out.println(System.getProperty("user.dir"));
		//ccpying screenshot to out project
	    //FileUtils.copyFile(src1, new File(System.getProperty("user.dir")+"//src//test//element.png"));
        driver.close();
	}

}
