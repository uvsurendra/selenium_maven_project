package basicsleneiumprograms;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotPractice {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		TakesScreenshot tks= ((TakesScreenshot)driver);
		File src=tks.getScreenshotAs(OutputType.FILE);
		System.out.println(System.getProperty("user+dir"));
		FileUtils.copyFile(src, new File(System.getProperty("user+dir")+"//src//test//img.png"));
		
        driver.close();
	}

}
