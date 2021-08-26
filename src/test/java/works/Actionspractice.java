package works;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionspractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		Actions action= new Actions(driver);
//		WebDriverWait d= new WebDriverWait(driver,10);
//		d.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='nav-orders']"))));
//		Thread.sleep(15000L);
//		action.moveToElement(driver.findElement(By.xpath("//*[@id='nav-orders']"))).build().perform();
//		driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
//		System.out.println("moved to the element");
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).click();
		action.keyDown(Keys.SHIFT).sendKeys("hello").sendKeys(Keys.ENTER).build().perform();
		driver.close();
	}

}
