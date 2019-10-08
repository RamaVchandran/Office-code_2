package org.test.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BIMsite {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automate tools\\Training\\Browser launch\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bimdex.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement findElements = driver.findElement(By.xpath("//ul[@id='main-menu']/li[2]/a/span"));
		WebDriverWait w = new WebDriverWait(driver, 100);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='main-menu']/li[2]/a/span")));
		Actions acc = new Actions(driver);
		acc.moveToElement(findElements);
		
		/*List<WebElement> product = driver.findElements(By.xpath("//ul[@id='main-menu']/li[2]/a/span"));

		
		for (WebElement x : product) {
			System.out.println(x);
			
		}*/
		
		
		
		
	}

}
