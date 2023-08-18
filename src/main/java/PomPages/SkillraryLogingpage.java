package PomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogingpage {
	// declaration
	//address og gear web element
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	// addres of skillrary demo app
	@FindBy(xpath="(//a[text(='SkillRary Demo App'])[2]")
	private WebElement skillrarydemoapp;
	@FindBy(name = "q")
	private WebElement seachtb;
	// addres of search text field
	@FindBy(xpath = "//input[@value = 'go']")
	private WebElement searchbtn;
	private WebElement searchtb;
	//initialization 
	public SkillraryLogingpage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	// utilization
	public void gearsbutton() {
		gearsbtn.click();		
	}
	public void Skillrarydemoapplication() {
		skillrarydemoapp.click();	
	}
	
	public void searchTextbox(String name) {
		searchtb.sendKeys(name);
		
	}
	public void gobutton() {
		searchbtn.click();	

}
	
}
