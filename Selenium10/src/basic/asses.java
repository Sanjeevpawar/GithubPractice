package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class asses {
	 

	public static void main(String[] args) throws InterruptedException {


	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://eqaroloflow.co.za/wp/wp-login.php?redirect_to=http%3A%2F%2Feqaroloflow.co.za%2Fwp%2Fwp-admin%2F&reauth=1");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	driver.findElement(By.id("user_login")).sendKeys("TestUser");
	driver.findElement(By.id("user_pass")).sendKeys("Tester5027#");
	driver.findElement(By.id("wp-submit")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Shop']")).click();
	driver.findElement(By.xpath("//span[text()='Shop']")).click();
	driver.findElement(By.xpath("//img[@alt='Wine']")).click();
	driver.findElement(By.xpath("//h2[text()='Beyerskloof Pinotage 2019']")).click();
	driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	driver.findElement(By.linkText("Proceed to checkout")).click();

	driver.findElement(By.id("place_order")).click();
	
	driver.findElement(By.xpath("//h1[text()='Order received']")).getText();
}
}
