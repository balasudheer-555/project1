package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.EnetrTimeTrackPage;
import page.LoginPage;
import page.LogoAndColorSchemePage;

public class ChangeColor extends BaseTest{
	@Test
	public void testChangeColor() throws Exception {
		String un = FWUtil.getXLData(XL_PATH, "ChangeColor", 1,0);
		String pw = FWUtil.getXLData(XL_PATH, "ChangeColor", 1,1);
		String title1 = FWUtil.getXLData(XL_PATH, "ChangeColor", 2,2);
		String title2 = FWUtil.getXLData(XL_PATH, "ChangeColor", 1,2);
		//Enter valid user name
		LoginPage l = new LoginPage(driver);
		l.setUserName(un);
		//Enter valid password
		l.setPassword(pw);
		//click login button
		l.clickLogin();
		Thread.sleep(3000);
		//verify home page is displayed 
		EnetrTimeTrackPage e = new EnetrTimeTrackPage(driver);
		e.verifyHomePageIsDisplayed(driver, ETO, title1);
		//click on settings
		e.clickSettings();
		//click on logo and color scheme
		e.clickLogoAndColor();
		Thread.sleep(3000);
		//verify logo and color scheme page is displayed
		LogoAndColorSchemePage lc = new LogoAndColorSchemePage(driver);
		lc.verifyLogoAndSchemePageIsDisplayed(driver, ETO, title2);
		Thread.sleep(1000);
		//verify radio button is displayed 
		lc.verifyRadioButtonIsSelected();
	}

}


