package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegisterUser {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarang\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\\\Users\\\\Sarang\\\\Downloads\\\\chrome-win64\\\\chrome-win64\\\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();			
		driver.findElement(By.id("ap_customer_name")).sendKeys("Sarang  Pawar");
		driver.findElement(By.id("ap_phone_number")).sendKeys("7219157401");
		driver.findElement(By.id("ap_email")).sendKeys("abhiyanta8555@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Sara@1234");
		driver.findElement(By.id("continue")).click();
		
		
		
		
		
		
		
	}

}
