package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		}
	@FindBy(linkText="Organizations")
	private WebElement organizationTab;
	
	@FindBy(xpath="//img[contains(@src,'user.PNG')]/..")
	private WebElement administration;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOutButton;

	public WebElement getOrganizationTab() {
		return organizationTab;
	}

	public WebElement getSignOutButton() {
		return signOutButton;
	}

	public WebElement getAdministration() {
		return administration;
	}
}
