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

public class TC_1Test extends BaseTest {
	@Test
	public void createOrganization() throws Exception {
		HomePage homePage=new HomePage(driver);
		Reporter.log("Execuiting TC_1",true);
		homePage.getOrganizationTab().click();
		Reporter.log("Sucessfully Organization page is Displayed",true);
		OrganizationsPage organizationPage= new OrganizationsPage(driver);
		organizationPage.getCreateOrganization().click();
		Reporter.log("Sucessfully createOrganization page is Displayed",true);
		CreateNewOrganizationPage createNewOrganization=new CreateNewOrganizationPage(driver);
		ExcelUtil util = new ExcelUtil();
		Random rnd=new Random();
		int rnm = rnd.nextInt(1000);
		createNewOrganization.getOrganizationName().clear();
		createNewOrganization.getOrganizationName().sendKeys(util.excelStringFile("Sheet1", 0, 0)+rnm);
		Assert.assertEquals(util.excelStringFile("Sheet1", 0, 0)+rnm,createNewOrganization.getOrganizationName().getAttribute("value"), "entered Value is Wrong");
		Reporter.log("Sucessfully entered the data into the organization TextField",true);
		createNewOrganization.getSave().click();
		Thread.sleep(1000);
	}
}
