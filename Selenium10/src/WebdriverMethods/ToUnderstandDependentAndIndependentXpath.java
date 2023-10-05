package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandDependentAndIndependentXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.meesho.com/search?q=watches");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		String price = driver.findElement(By.xpath("//p[text()='Fashionate Sports Watches']/..//h5")).getText();
		System.out.println(price);
	}

}
