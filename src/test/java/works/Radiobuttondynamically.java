package works;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttondynamically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		List<WebElement> l= driver.findElements(By.xpath("//td[@class='table5'] //input[@name='group1']"));
		for(int i=0;i<l.size();i++)
		{
			String value=l.get(i).getAttribute("value");
			if(value.equals("Cheese"))
			{
				l.get(i).click();
			}
		}
	}

}
