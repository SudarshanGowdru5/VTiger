package genericLibrary;

import java.util.Set;

import org.openqa.selenium.WebElement;
/***
 * 
 * @author Sudarshan
 *
 */
public class WebDriverUtil extends BaseTest {
	/**
	 * This method is used to switch the driver control to a any window where the element is present
	 * @param title
	 */
    public void switchToWindow(String title) {
    	String parentwId = driver.getWindowHandle();
    	Set<String> allWindowIds = driver.getWindowHandles();
    	allWindowIds.remove(parentwId);
    	for(String windowIds:allWindowIds) {
    		driver.switchTo().window(windowIds);
    		if(driver.getTitle().equalsIgnoreCase(title)) {
    			break;
    		}
    	}
    }
    /**
     * This method is used to switch the driver control to a particular window where the element is present
     * @param element that present on the required page
     */
    
    public void swithcToASpecificWindow(WebElement element) {
    	String parentWIds = driver.getWindowHandle();
    	Set<String> allWindowIds = driver.getWindowHandles();
    	allWindowIds.remove(parentWIds);
    	for(String windowIds:allWindowIds) {
    		driver.switchTo().window(windowIds);
    		if(element.isDisplayed()) {
    			break;
    		}
    	}
    }
}
