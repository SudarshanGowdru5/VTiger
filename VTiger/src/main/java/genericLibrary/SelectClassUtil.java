package genericLibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/***
 * 
 * @author Sudarshan
 *
 */
public class SelectClassUtil {
 /**
  * This method  will select drop down based on Index ,value and visible Text
  * @param listBox pass the drop down element
  * @param data it can be index or value or visible text
  */
	public void selectDropDown(WebElement listBox,String data) {
		Select select=new Select(listBox);
		
		int count=0;
		
		try {
			int index=Integer.parseInt(data);
			select.selectByIndex(index);
			count++;
		} catch(Exception e) {
			
		}
		
		if(count==0) {
			try {
				select.selectByVisibleText(data);
			}catch(Exception e) {
				select.selectByValue(data);
			}
		}
	}
}
