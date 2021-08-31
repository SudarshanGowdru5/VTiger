package organization;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.CreateNewOrganizationPage;
import pomRepository.HomePage;
import pomRepository.OrganizationsPage;

public class TC_4Test extends BaseTest{
	@Test
	public void CheckWhileCreatingNewOrganizationTypeDropDownOption() {
		HomePage homePage=new HomePage(driver);
		Reporter.log("Execuiting TC_4",true);
		CreateNewOrganizationPage createNewOrganization=new CreateNewOrganizationPage(driver);
		homePage.getOrganizationTab().click();
		Reporter.log("Sucessfully entered the data into the organization TextField",true);
		OrganizationsPage organizationPage= new OrganizationsPage(driver);
		organizationPage.getCreateOrganization().click();
		Reporter.log("Sucessfully entered the data into the organization TextField",true);
		WebElement organizationTextField = driver.findElement(By.name("accountname"));
		String name="TestYantra";
		Random rnd=new Random();
		int rnm = rnd.nextInt(1000);
		organizationTextField.clear();
		organizationTextField.sendKeys(name+rnm);
		Reporter.log("Sucessfully entered the data into the organization TextField",true);
		createNewOrganization.getOrganizationName().clear();
		createNewOrganization.getOrganizationName().sendKeys(name+rnm);
		Assert.assertEquals(name+rnm,createNewOrganization.getOrganizationName().getAttribute("value"), "entered Value is Wrong");
		createNewOrganization.getTypeDropDown().click();
		Reporter.log("Sucessfully type DropDown is Displayed",true);
	}
}
