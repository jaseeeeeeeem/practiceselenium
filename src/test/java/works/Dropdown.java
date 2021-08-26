package works;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		Select dropdown= new Select(driver.findElement(By.xpath("//select[contains(@id,'DropDownListCurrency')]")));
		
		dropdown.selectByIndex(2);
		Thread.sleep(3000L);
		dropdown.selectByValue("AED");
		Thread.sleep(3000L);
		dropdown.selectByVisibleText("USD");
		
		if(!driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).isSelected());
		{
			driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).click();
			Thread.sleep(4000L);
		}
		
		WebElement d1= driver.findElement(By.className("paxinfo"));
		d1.click();
		Select s1= new Select(d1.findElement(By.xpath("//select[contains(@id,'Adult')]")));
		s1.selectByIndex(3);
		
		driver.findElement(By.xpath("//input[contains(@id,'date1')]")).click();
		System.out.println("clicked");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-active')]")).click();
		
		
//		driver.findElement(By.xpath("//input[contains(@id,'date1')]")).click();
//		int flag=0;
//		List<WebElement> l=null; 
//		while(flag==0)
//		{
//		l=driver.findElements(By.xpath("//div[contains(@class,'ui-datepicker-group')]"));
//		for(int i=0;i<l.size();i++)
//		{
//			if(l.get(i).findElement(By.xpath("//span[contains(@class,'month')]")).getText().equalsIgnoreCase("December"))
//			{
//				flag=1;
//			}
//			else {
//				WebElement temp= l.get(i);
//				temp.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//			}
//		}
//		}
		
		if(driver.findElement(By.xpath("//div[@class='picker-second']")).getAttribute("style").contains("0.5")){
			System.out.println("disabled");
		}
		
		
		
		
		Thread.sleep(5000L);
		
		
		
		
		driver.close();
		
	}

}
