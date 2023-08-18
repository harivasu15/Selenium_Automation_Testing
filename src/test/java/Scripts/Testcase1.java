package Scripts;
import org.testng.annotations.Test;
import GenericLibrary.BaseClass;
import PomPages.SkillraryDemologinpage;
import PomPages.SkillraryLogingpage;
import GenericLibrary.WebDriverUtilities;
import PomPages.AddtoCartpage;

public class Testcase1 extends BaseClass{
	
	@Test
	public void testcase1() {
		 SkillraryLogingpage s = new  SkillraryLogingpage(driver);
		s.gearsbutton();
		s.Skillrarydemoapplication();
		 utilies.switchtabs(driver);
		 SkillraryDemologinpage sd = new SkillraryDemologinpage(driver);
		 utilies.moseHover(driver,sd.getCoursetab());
		 sd.seleniumtrainingtab();
		 AddtoCartpage d = new AddtoCartpage(driver);
		 utilies.doubleClick(driver, d.getAddbutton());
		 d.carttocartbtn();
		 utilies.alertPopup(driver);
		 			
	}
	

}
