package PomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//declaration
	//address of selenium training
	@FindBy(xpath="//[text()='Selenium Training'][2]")
	private WebElement seleniumtraining;
	//address of cart
	@FindBy(id="mycart")
	private WebElement cartbtn;
	@FindBy(xpath="//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	//initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//Utilization
	public WebElement getSeleniumtraining() {
		return seleniumtraining;
		
	}
	public WebElement getcarttab() {
		return cartbtn;
		
	}
	public WebElement getFacebook() {
		return facebook;
		
	}
	public void facebookicon() {
		facebook.click();
	}
	
	

}
