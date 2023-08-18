package GenericLibrary;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;


public class WebDriverUtilities<JavascriptExecutor> {
	// Handling drop down
	public void dropdown(WebElement ele,String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);	
	}
	// Handling mouse over
	public void moseHover(WebDriver driver ,WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();		
	}
	//handling the double click
	public void doubleClick(WebDriver driver ,WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	// handling the right click
	public void rightClick(WebDriver driver ,WebElement ele) {
		Actions a = new Actions(driver);
		a.click(ele).perform();
	}
	// Handling drag and drop
	public void dragdrop(WebDriver driver,WebElement src,WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, target).perform();	
	}
	// shifting control to frame
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);		
	}
	// shifting control to normal webpage
	public void switchbackframe(WebDriver driver) {
		driver.switchTo().defaultContent();	
		
	}
	//shifting control to pop up
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
			
	}
	// shifting control to child window
	public void switchtabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		
		}
		// handling scroll bar
		//public void scrollBar(WebDriver driver int x,int y) {
			//JavascriptExecutor js = (JavascriptExecutor)driver;
			 //js.executeScript("windows.scrollBy("+x+","+y+")");
			
			
		}
		
		
	}


