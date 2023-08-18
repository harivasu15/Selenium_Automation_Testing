package GenericLibrary;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.*;


public class BaseClass {
	public WebDriver driver;
	public PropertyFile pdata = new PropertyFile();
	public WebDriverUtilities utilies = new  WebDriverUtilities();//
	@BeforeMethod
	public void openApp() throws Throwable {
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		//driver = new ChromeDriver();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getpropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void CloseApp(ITestResult res) throws Throwable {
		int status = res.getStatus();
		String name = res.getName();
		if(status == 2) {
			// photo p = new photo()
			Photo p = new Photo();
			p.getphoto(driver, name);
		
		}
		driver.quit();
		
		
	}
	
	
	

}
