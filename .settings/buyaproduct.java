package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ActionChainExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.bigbasket.com.bigbasket.Basepage;
import com.bigbasket.com.bigbasket.Basetest;

import POM.loginpage;

public class buyaproduct extends Basetest{
	
	@Test
	public void buyaproduct() throws InterruptedException
	{
		loginpage lp=new loginpage(driver);
		lp.clickloginlink();
		lp.enteremailid("vijayalaxmibgudage@gmail.com");
		lp.enterpwd("12345678");
		lp.clickloginbtn();
		WebElement ele = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
		
		Basepage bp=new Basepage(driver);
	 bp.ActionClass(ele);
	 driver.findElement(By.xpath("(//a[.='Branded Foods'])[1]")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//span[.='Baby Food'])[3]")).click();
	 driver.findElement(By.xpath("//img[starts-with(@class,'img-responsive') and contains(@src,'https://www.bigbasket.com/media/uploads/p/s/1201642_1-nestle-nan-pro-stage-2.jpg')")).click();
	 driver.findElement(By.xpath("//a[@id='p_240155_1']")).click();
	 driver.findElement(By.xpath("//div[@class='my-basket-btn']")).click();
	 driver.findElement(By.xpath("//button[@id='checkout']")).click();
	 
	}
	
	

}
