package genericLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
/***
 * 
 * @author Sudarshan
 *
 */
public class ActionsUtil extends BaseTest{
	/**
	 * This class is to perform Keyboard and mouse actions on webPage
	 * @param source
	 * @param target
	 */
	
	public void  actionDragAndDrop(WebElement source,WebElement target) {
		/**
		 * This method is used to perform action like drag and drop
		 */
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}
	/**
	 * This class is to perform Keyboard and mouse actions on webPage
	 * like drag and drop using offset
	 * @param source
	 * @param target
	 */
	public void actionsDragAndDrop(WebElement source,int xOffset,int yOffset) {
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(source, xOffset, yOffset).perform();
	}
}