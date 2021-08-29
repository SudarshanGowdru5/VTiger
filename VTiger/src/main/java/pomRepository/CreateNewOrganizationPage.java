package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationPage {
	public CreateNewOrganizationPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="accountname")
	private WebElement organizationName;
	
	@FindBy(name="industry")
	private WebElement industryDropDown;
	
	@FindBy(name="accounttype")
	private WebElement typeDropDown;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement save;
	
	public WebElement getOrganizationName() {
		return organizationName;
	}
	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}
	public WebElement getTypeDropDown() {
		return typeDropDown;
	}
	public WebElement getSave() {
		return save;
	}
}

