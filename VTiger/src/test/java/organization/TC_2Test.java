package organization;

import java.util.Random;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.CreateNewOrganizationPage;
import pomRepository.HomePage;
import pomRepository.OrganizationsPage;

public class TC_2Test extends BaseTest{
	@Test
	public void CheckWhileCreatingNewOrganizationIndustryDropDownOption() {
		HomePage homePage=new HomePage(driver);
		Reporter.log("Execuiting TC_2",true);
		homePage.getOrganizationTab().click();
		Reporter.log("Sucessfully Organization page is Displayed",true);
		OrganizationsPage organizationPage= new OrganizationsPage(driver);
		organizationPage.getCreateOrganization().click();
		Reporter.log("Sucessfully createOrganization page is Displayed",true);
		CreateNewOrganizationPage createNewOrganization=new CreateNewOrganizationPage(driver);
		String name="TestYantra";
		Random rnd=new Random();
		int rnm = rnd.nextInt(1000);
		createNewOrganization.getOrganizationName().clear();
		createNewOrganization.getOrganizationName().sendKeys(name+rnm);
		Assert.assertEquals(name+rnm,createNewOrganization.getOrganizationName().getAttribute("value"), "entered Value is Wrong");
		Reporter.log("Sucessfully entered the data into the organization TextField",true);
		createNewOrganization.getIndustryDropDown().click();
		Reporter.log("Sucessfully Industry DropDown is Displayed",true);
	}
}
