package GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.FileNotFoundException;

public class PropertyFile {
	public String getpropertydata(String  key) throws Throwable {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(IpathConstant.propertyfilepath);
		p.load(fis);
		return p.getProperty(key);
		
	}

}
