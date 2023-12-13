package Amazon;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	public static void main(String[] args){


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarang\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\\\Users\\\\Sarang\\\\Downloads\\\\chrome-win64\\\\chrome-win64\\\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iphone");
		searchbox.click();	
		driver.findElement(By.id("nav-search-submit-button")).click();	
		driver.findElement(By.linkText("iPhone 13 (128GB) - Blue")).click();
		WebElement addcart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addcart.click();
		
	}

}
