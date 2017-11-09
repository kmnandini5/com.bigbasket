package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.poi.xwpf.usermodel.Document;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bigbasket.com.bigbasket.Basepage;
import com.bigbasket.com.bigbasket.Basetest;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import POM.HomePage;
import POM.loginpage;

public class emptybasket extends Basetest {
	
	@Test
	public void buyaproduct() throws InterruptedException
	{
		loginpage lp=new loginpage(driver);
		lp.clickloginlink();
		lp.enteremailid("vijayalaxmibgudage@gmail.com");
		lp.enterpwd("12345678");
		lp.clickloginbtn();
	    driver.manage().window().maximize();
	
	WebElement ele1 = driver.findElement(By.xpath("//a[text()='Shop by Category ']/.."));
	WebElement ele2 = driver.findElement(By.xpath("(//a[.='Branded Foods'])[1]"));
	
	HomePage hp=new HomePage(driver);
	hp.mousehover(ele1);
	hp.mousehover2(ele2);
	
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//span[.='Baby Food'])[3]")).click();
	 driver.findElement(By.xpath("//a[.='Cerelac Stage - 4 Multi Grain & Fruits']")).click();
	 driver.findElement(By.xpath("(//span[@class='icon icon-basket-gray'])[1]")).click();
	 driver.findElement(By.xpath("//span[@class='basket-content']")).click();
	 driver.findElement(By.xpath("//a[@class='uiv2-empty-basket']")).click();
	 Alert alt=driver.switchTo().alert();
	 alt.accept();
	 
	WebElement expected = driver.findElement(By.xpath("//div[.='There are no items in your basket.']"));
	 Basepage bp=new Basepage(driver);
	 bp.VerifyElementIsPresent(expected);
	}
}
	



