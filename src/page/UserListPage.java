package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UserListPage {
	@FindBy(xpath="//span[.='1 time zone']")
	private WebElement timeZoneDDl;
	
	@FindBy(xpath="(//img[@class='x-form-radio'])[2]")
	private WebElement radioBTN;
	

	@FindBy(id="ext-gen365")
	private WebElement checkBox;
	
	@FindBy(xpath="//span[.='Apply'][1]")
	private WebElement applyBTN;
	
	@FindBy(id="ext-gen128")
	private WebElement deselectCB;
 
	public UserListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clicktimeZoneDDl() {
		timeZoneDDl.click();
	}
	public void clickRadioButton() {
		radioBTN.clear();
	}
	public void clickApplyButton() {
		applyBTN.click();
	}
	public void clickLondonCheckBox() {
		checkBox.click();
	}
	public void clickDeselectCB() {
		deselectCB.click();
	}
	public void verifyUserListPageIsDisplayed(WebDriver driver,String eTitle,long ETO) {
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		wait.until(ExpectedConditions.titleIs(eTitle));
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle,eTitle);
	}
}




