package package1;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ticket {
	@Test
	public void mytrip(String from,String to) throws Throwable {
		Date date=new Date();
		String cdate=date.toString();
		String[] arr=cdate.split(" ");
		String day=arr[0];
		String month=arr[1];
		String todaydate=arr[2];
		String year=arr[5];
		String xpath=day+" "+month+" "+todaydate+" "+year;
		System.out.println(xpath);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		driver.findElement(By.xpath("//span[.='From']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Ahmedabad");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='"+xpath+"']")).click();
	}
		
		
		
		

}
