package organization;

import java.util.Random;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.ExcelUtil;
import pomRepository.CreateNewOrganizationPage;
import pomRepository.HomePage;
import pomRepository.OrganizationsPage;

public class TC_4Test extends BaseTest{
	@Test
	public void CheckWhileCreatingNewOrganizationTypeDropDownOption() throws Exception {
		HomePage homePage=new HomePage(driver);
		Reporter.log("Execuiting TC_4",true);
		CreateNewOrganizationPage createNewOrganization=new CreateNewOrganizationPage(driver);
		homePage.getOrganizationTab().click();
		Reporter.log("Sucessfully entered the data into the organization TextField",true);
		OrganizationsPage organizationPage= new OrganizationsPage(driver);
		organizationPage.getCreateOrganization().click();
		Reporter.log("Sucessfully entered the data into the organization TextField",true);
		ExcelUtil util = new ExcelUtil();
		Random rnd=new Random();
		int rnm = rnd.nextInt(1000);
		Reporter.log("Sucessfully entered the data into the organization TextField",true);
		createNewOrganization.getOrganizationName().clear();
		createNewOrganization.getOrganizationName().sendKeys(util.excelStringFile("Sheet1", 0, 0)+rnm);
		Assert.assertEquals(util.excelStringFile("Sheet1", 0, 0)+rnm,createNewOrganization.getOrganizationName().getAttribute("value"), "entered Value is Wrong");
		createNewOrganization.getTypeDropDown().click();
		Reporter.log("Sucessfully type DropDown is Displayed",true);
	}
}
