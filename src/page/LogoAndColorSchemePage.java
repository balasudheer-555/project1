package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class LogoAndColorSchemePage {
@FindBy(id="purple")
private WebElement colorBox;

@FindBy(id="useDefaultLogoOption")
private WebElement radioBTN;

public LogoAndColorSchemePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickColorBox() {
	colorBox.click();
}
public void verifyRadioButtonIsSelected() {
	boolean res = radioBTN.isSelected();
	Reporter.log("radiobutton is displayes "+res,true);
}
public void verifyLogoAndSchemePageIsDisplayed(WebDriver driver,long ETO,String eTitle ) {
	WebDriverWait wait = new WebDriverWait(driver, ETO);
	wait.until(ExpectedConditions.titleIs(eTitle));
	String aTitle = driver.getTitle();
	Assert.assertEquals(aTitle,eTitle);
}
}


