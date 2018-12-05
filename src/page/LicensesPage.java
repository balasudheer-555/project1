package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;


public class LicensesPage {
	//@FindBy(xpath="//div[contains(.,'actiTIME')]")
	@FindBy(xpath="//nobr[text()='Product Edition:']/../../td[2]")
	private WebElement productEdition;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public LicensesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickLogout() {
		logoutLink.click();
	}
	public void verifyProductEdition(String expected) {
		String actual = productEdition.getText();
		Reporter.log("Actual ProductEdition : " +actual,true);
		Reporter.log("expected ProductEdition : " + expected,true);
		Assert.assertEquals(actual, expected);
	}

}
