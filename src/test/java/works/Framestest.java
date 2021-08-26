package works;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framestest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		List<WebElement> l=driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//*[@id='draggable']")).getText());
		Actions a= new Actions(driver);
		
		a.dragAndDrop(driver.findElement(By.xpath("//*[@id='draggable']")), driver.findElement(By.xpath("//*[@id='droppable']"))).build().perform();
		
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		System.out.println(driver.findElement(By.xpath("//*[@id='draggable']")).getText());
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
		//if id is provided, we can do directly
		
		driver.quit();
	}

}
