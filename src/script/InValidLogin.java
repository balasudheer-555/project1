package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.LoginPage;

public class InValidLogin extends BaseTest{
@Test(priority=2)
public void testInValidLogin() throws Exception {
	int rc = FWUtil.getXLRowCount(XL_PATH, "InValidLogin");
	for(int i=1;i<rc;i++) {
	String un = FWUtil.getXLData(XL_PATH, "InValidLogin", 1, 0);
	String pw = FWUtil.getXLData(XL_PATH, "InValidLogin", 1, 1);
	LoginPage l  = new LoginPage(driver);
	//enter the invalid username
	l.setUserName(un);
	//enter the invalid password
	l.setPassword(pw);
	//click login button
	l.clickLogin();
	Thread.sleep(2000);
	//verify error message is displayed or not
	l.verifyErrMsgIsDisplayed();
}
}
}
