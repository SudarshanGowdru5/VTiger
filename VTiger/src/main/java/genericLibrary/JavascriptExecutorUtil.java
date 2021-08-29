package genericLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
/***
 * 
 * @author Sudarshan
 *
 */
public class JavascriptExecutorUtil extends BaseTest{
	/**
	 * This method is used to perform scrollAction on webPage
	 * @param element pass the element on which you have to perform action
	 * @param x pass the units how much to scroll in x axis
	 * @param y pass the units how much to scroll in y axis
	 */

	public void javaScriptScroll(WebElement element,int x,int y) {

		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(;;) {
			try {
				element.click();
				break;
			}catch(NoSuchElementException e) {
				js.executeScript("window.scrollBy(x,y);");
			}
		}
	}
}

