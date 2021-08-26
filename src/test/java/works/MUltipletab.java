package works;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MUltipletab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//*[@id="gf-BIG"]/table/tbody/tr/td[1]/ul
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement col= driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		List<WebElement> l=col.findElements(By.tagName("a"));
		String k1=Keys.chord(Keys.CONTROL,Keys.ENTER);
		for(int i=1;i<l.size();i++)
		{
			l.get(i).sendKeys(k1);
		}
		
		Set<String> s=driver.getWindowHandles();
		Iterator<String> it= s.iterator();
//		it.next();
		while(it.hasNext())
		{
			String temp=it.next();
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
//			driver.switchTo().defaultContent();
		}
		Thread.sleep(5000L);
		driver.quit();

	}

}
