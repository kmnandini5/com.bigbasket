package Scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bigbasket.com.bigbasket.Basetest;
import com.bigbasket.com.bigbasket.bigbasket_constants;

public class dummy implements bigbasket_constants{
	
	
	public void dummy()
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	    FirefoxDriver driver = new FirefoxDriver();
		 driver.navigate().to("https://www.bigbasket.com/basket/?ver=1");
		 driver.findElement(By.xpath("//a[@class='uiv2-empty-basket']")).click();
		 Alert alt=driver.switchTo().alert();
		 alt.accept();
	}
}
