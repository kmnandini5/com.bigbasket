package Scripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bigbasket.com.bigbasket.Basetest;
import com.gargoylesoftware.htmlunit.WebWindow;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class home_banner_winterstore_skincare extends Basetest{
	
	@Test
	public void verifybannerheader()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//img[starts-with(@class,'img-responsive') and contains(@src,'//www.bigbasket.com/media/customPage/355c27b8-a44f-4900-a390-8e82c69b8021/49a1c966-2840-4644-8bd6-6b6c732a505d/3c206183-27f2-4358-8fe9-55104ad4b90c/DT_Skin_480x360_25thOct.jpg')]")).click();
		String actual = driver.findElement(By.xpath("(//span[.='Skin Care'])[6]")).getText();
		
		AssertJUnit.assertEquals(actual, "Skin Care ");
	
		System.out.println("title matching");
		
		
	}
}