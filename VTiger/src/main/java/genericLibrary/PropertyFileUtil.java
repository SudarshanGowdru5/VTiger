package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/***
 * 
 * @author Sudarshan
 *
 */
public class PropertyFileUtil {
	/**
	 * This method is used to import the data from property file
	 * @param key pass the key of particular value you want
	 * @return value is the return of the key
	 * @throws IOException
	 */
	public String propertyFile(String key) throws IOException {
	File abPath=new File(IAutoConstants.PROPERTY_PATH);
	FileInputStream fis = new FileInputStream(abPath);
	Properties properties=new Properties();
    properties.load(fis);
	String value = properties.getProperty(key);
	return value;
}
}
