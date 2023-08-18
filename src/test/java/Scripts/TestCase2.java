package Scripts;
import org.testng.annotations.Test;
import GenericLibrary.BaseClass;
import PomPages.SkillraryLogingpage;
import PomPages.SkillraryDemologinpage;
import PomPages.TestingPage;


public class TestCase2  extends BaseClass{
	@Test
	 public void testcase2() throws Throwable {
		 SkillraryLogingpage s = new  SkillraryLogingpage(driver);
			s.gearsbutton();
			s.Skillrarydemoapplication();
			 utilies.switchtabs(driver);
			 SkillraryDemologinpage sd = new SkillraryDemologinpage(driver);
			 utilies.dropdown(sd.getCourseadd(),pdata.getpropertydata("courseadd"));
			 TestingPage tp = new TestingPage(driver);
			 utilies.dragdrop(driver, tp.getSeleniumtraining(), tp.getcarttab());
			
	}

}
