package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.EnetrTimeTrackPage;
import page.LicensesPage;
import page.LoginPage;

public class CheckProductEdition extends BaseTest {
	@Test(priority=3)
	public void testCheckProductEdition() throws Exception {
		String un = FWUtil.getXLData(XL_PATH, "CheckProductEdition", 1,0);
		String pw = FWUtil.getXLData(XL_PATH, "CheckProductEdition", 1,1);
		String productEdition = FWUtil.getXLData(XL_PATH, "CheckProductEdition", 1,2);
		//Enter valid user Name
		LoginPage l = new LoginPage(driver);
		l.setUserName(un);
		//Enter valid password
		l.setPassword(pw);
		//click on login button
		l.clickLogin();
		Thread.sleep(2000);
		//click on settings
		EnetrTimeTrackPage e = new EnetrTimeTrackPage(driver);
		e.clickSettings();
		//click on licenses
		e.clickLicenses();
		//check the product edition
		LicensesPage c = new LicensesPage(driver);
		c.verifyProductEdition(productEdition);
		//click on logout link
		c.clickLogout();
	}

}
