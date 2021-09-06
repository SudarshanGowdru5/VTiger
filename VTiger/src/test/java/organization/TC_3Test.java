package organization;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.ExcelUtil;
import pomRepository.CreateNewOrganizationPage;
import pomRepository.HomePage;
import pomRepository.OrganizationsPage;

public class TC_3Test extends BaseTest{
	@Test
	public void createOrganizationWithIndustry() throws Exception {
		HomePage homePage=new HomePage(driver);
		Reporter.log("Execuiting TC_3",true);
		CreateNewOrganizationPage createNewOrganization=new CreateNewOrganizationPage(driver);
		homePage.getOrganizationTab().click();
		Reporter.log("Sucessfully Organization page is Displayed",true);
		OrganizationsPage organizationPage= new OrganizationsPage(driver);
		organizationPage.getCreateOrganization().click();
		Reporter.log("Sucessfully createOrganization page is Displayed",true);
		ExcelUtil util = new ExcelUtil();
		Random rnd=new Random();
		int rnm = rnd.nextInt(1000);
		createNewOrganization.getOrganizationName().clear();
		createNewOrganization.getOrganizationName().sendKeys(util.excelStringFile("Sheet1", 0, 0)+rnm);
		Assert.assertEquals(util.excelStringFile("Sheet1", 0, 0)+rnm,createNewOrganization.getOrganizationName().getAttribute("value"), "entered Value is Wrong");
		WebElement industryDropDown = createNewOrganization.getIndustryDropDown();
		Select select=new Select(industryDropDown);
		select.selectByVisibleText("Education");
		Reporter.log("Sucessfully selected a categaory from Industry DropDown",true);
		createNewOrganization.getSave().click();
		Reporter.log("Sucessfully saved the Organization",true);
		Thread.sleep(500);
	}
}
