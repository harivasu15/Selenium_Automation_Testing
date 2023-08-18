package PomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SkillraryDemologinpage {
	//address of course webelement
	@FindBy(id = "course")
	private WebElement coursetab;
	// addres of dropdown webelement
	@FindBy(name = "addresstype")
	private WebElement courseadd;
	@FindBy(xpath = "//atext()='Selenium training']")
	private WebElement seleniumtraining;
	//initialization
	public SkillraryDemologinpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public WebElement getCourseadd() {
		return courseadd;
			
	}
	public WebElement getCoursetab() {
		return coursetab;
		
	}
	public void seleniumtrainingtab() {
		seleniumtraining.click();
	}
	

}
