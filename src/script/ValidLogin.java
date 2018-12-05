package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.EnetrTimeTrackPage;
import page.LoginPage;


public class ValidLogin extends BaseTest {
	@Test(priority=1)
	public void testValidLogin() {
		String un = FWUtil.getXLData(XL_PATH, "ValidLogin", 1, 0);
		String pw = FWUtil.getXLData(XL_PATH, "ValidLogin", 1, 1);
		String title = FWUtil.getXLData(XL_PATH, "ValidLogin", 1, 2);
		LoginPage l = new LoginPage(driver);
		//Enter valid username
		l.setUserName(un);
		//enter valid password
		l.setPassword(pw);
		//click on login button
		l.clickLogin();
		//verify that home page is displayed or not
		EnetrTimeTrackPage e = new EnetrTimeTrackPage(driver);
		e.verifyHomePageIsDisplayed(driver, ETO, title);
	}

}
