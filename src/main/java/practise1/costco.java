package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class costco {


	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\Desktop\\Desttop\\ENVIRONMENT SETUP\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.costco.com");
		
		
	/*	@FindBy(id="logonId")
		WebElement enteremail;
		
		@FindBy(id="logonPassword")
		WebElement enterpassword;
		
		@FindBy(xpath="//input[@type='submit' and @class='primary' ]")
		WebElement loginbtn;
	*/
		driver.findElement(By.id("header_sign_in")).click();
		driver.findElement(By.id("logonId")).sendKeys("ahmad@mailinator.com");
		driver.findElement(By.id("logonPassword")).sendKeys("@Automation1");
		driver.findElement(By.xpath("//input[@type='submit' and @class='primary' ]")).click();
		
		
		
		
		
		
		

	}

}
