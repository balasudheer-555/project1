package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import generic.BaseTest;

public class EnetrTimeTrackPage{
	@FindBy(xpath="//div[contains(text(),'Settings')]")
	private WebElement settings;
	
	@FindBy(linkText="Licenses")
	private WebElement licenses;
	
	@FindBy(linkText="Logo & Color Scheme")
	private WebElement logoAndColor;
	
	@FindBy(xpath="(//div[@class='img'])[4]")
	private WebElement userListIMG;
	
	public EnetrTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSettings() {
		settings.click();
	}
	public void clickLicenses() {
		licenses.click();
	}
	public void clickLogoAndColor() {
		logoAndColor.click();
	}
	public void clickUserListIMG() {
		userListIMG.click();
	}
	
	
public void verifyHomePageIsDisplayed(WebDriver driver,long ETO,String eTitle) {
	WebDriverWait wait = new WebDriverWait(driver, ETO);
	wait.until(ExpectedConditions.titleIs(eTitle));
	String aTitle = driver.getTitle();
	Assert.assertEquals(aTitle,eTitle);
}
}
