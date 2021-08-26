package works;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderfuturedates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//*[@id='travel_date']")).click();
		while(!driver.findElement(By.cssSelector(".datepicker-days > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(2)")).getText().contains("December"))
		{
			driver.findElement(By.cssSelector(".datepicker-days > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(3)")).click();
		}
		
		List<WebElement> l= driver.findElements(By.xpath("//td[@class='day']"));
		
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).getText().contains("23"))
			{
				l.get(i).click();
				break;
			}
		}

	}

}
