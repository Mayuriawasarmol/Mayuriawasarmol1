package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilies {
	
	
	
	public void dropDown(WebElement ele,String test) {
		Select s=new Select(ele);
		s.selectByVisibleText(test);
		}
	
	public void mouseHover(WebDriver driver,WebElement ele) {
		
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		}
	
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
		}
	
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	public void dragdrop(WebDriver driver,WebElement src,WebElement target) {
	Actions a=new Actions(driver);
	a.dragAndDrop(src, target).perform();
	}
	
	public void switchFrame1(WebDriver driver) {
		driver.switchTo().frame(0);
		
	}
	
	public void switchFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
		
	}
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
	public void switchingtabs(WebDriver driver) {
		 Set<String> child = driver.getWindowHandles();
		for(String b:child) {
		driver.switchTo().window(b);
		}
	}
	
	public void scrollbar(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("windows.scrollby("+x+","+y+")");
		
	}
	
	}



	
	