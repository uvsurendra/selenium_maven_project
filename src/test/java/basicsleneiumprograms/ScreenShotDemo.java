package basicsleneiumprograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	//TakesScreenShot tks=((TakesScreenShot)driver);
	TakesScreenshot tks=((TakesScreenshot)driver);
   File image= tks.getScreenshotAs(OutputType.FILE);
   File destFile = new File("./test/img1.jpg");
    FileUtils.copyFile(image, destFile);
    System.out.println("Screenshot saved ");
	
	}

}
