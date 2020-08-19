package practise1;

import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\Desktop\\Desttop\\ENVIRONMENT SETUP\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//dynamic Wait.
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https:www.hotmail.com");
		
		
		//Take screen shot and store as file format
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//now copy the screenshot to a desired location using copyfile method.
		File
		
		//(src, new File("C:\\Users\\rafi\\eclipse-workspaceNEW\\COSTCOpractise\\src\\main\\java\\practise1\\hotmail.png"));
		

	}

}
