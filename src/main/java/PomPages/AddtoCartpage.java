package PomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddtoCartpage {
	// addres od + icon
	@FindBy(id = "add")
	private WebElement addbutton;
	@FindBy(xpath="//button[text()=' Add to cart']")
	private WebElement cartbutton;
	// initialization
	public AddtoCartpage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//Utilization
	public WebElement getAddbutton() {
		return addbutton;
		
	}
	public void carttocartbtn() {
		cartbutton.click();
		
	}
	
	

}
