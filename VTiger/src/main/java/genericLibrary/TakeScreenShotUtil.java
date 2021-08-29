package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
/***
 * 
 * @author Sudarshan
 *
 */
public class TakeScreenShotUtil extends BaseTest{
	/**
	 * This method is used to Take screenShot of webPage
	 */
	public void takeScreenShot() {
		String localDateTime = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot screenShot= (TakesScreenshot) BaseTest.driver;
		File tempFile = screenShot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./src/test/resources/screenShots/"+localDateTime+".png");
		try {
			FileUtils.copyFile(tempFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}