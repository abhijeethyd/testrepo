import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;


public class Runner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub




		System.setProperty("webdriver.chrome.driver", "C:/Trainings/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();





		//Implicit Wait
	//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//	driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
	//	driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();		
		
		
	//	WebElement element =  driver.findElement(By.xpath("//p[text()='WebDriver']"));		
	//	System.out.println(element.getText());
		
		// Explicit Wait

//		WebDriverWait  wait = new WebDriverWait(driver,30);		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));		
		//system.out.println(element.getText());


				//Fluent Wait -- Difficult Concept can leave it for Later 
		
//				Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
//						.withTimeout(30, TimeUnit.SECONDS)
//						.pollingEvery(1, TimeUnit.SECONDS)
//						.ignoring(NoSuchElementException.class);
//		
//		
//				WebElement elementOne = fluentWait.until(new Function<WebDriver, WebElement>()
//				{
//					@Override
//					public WebElement apply(WebDriver driver) {
//						// TODO Auto-generated method stub
//						WebElement ele = driver.findElement(By.xpath("//*[@id='demo']"));				
//						System.out.println(ele.getText());			
//						return null;
//					
//					}
//				});
//				
		//		WebElement searchBox = chromedriver.findElement(By.id("search_query_top"));		
		//		WebElement searchButton = chromedriver.findElement(By.name("submit_search"));		
		//		//WebElement signIn = chromedriver.findElement(By.xpath("//a[@class='login']"));	
		//		WebElement loginIn = chromedriver.findElement(By.cssSelector(".login"));
		//		


		//JavaScript
		driver.get("http://automationpractice.com/index.php?");
		System.out.println(driver.getTitle());
		Asserts.check(driver.getTitle().contains("sdflkfgjajgfsjdfgljs"), "Unable to Fine My");
//		Thread.sleep(10000);
//		((JavascriptExecutor)driver).executeScript("document.getElementById('search_query_top').click();");






		// GENERAL LOGIN FLOW
//		driver.get("http://automationpractice.com/index.php?");
//		WebElement signInLink = driver.findElement(By.cssSelector(".login"));	
//		signInLink.click();
//		
//		WebElement emailAddress = driver.findElement(By.cssSelector("#email"));
//		WebElement password = driver.findElement(By.xpath("//input[@id=\"passwd\"]"));
//		WebElement signInButton = driver.findElement(By.id("SubmitLogin"));
//		
		
		
		//Asserts.check(signInButton.getText().contains("teew"), "Unable to Display Sign In Element");
//


	}
}