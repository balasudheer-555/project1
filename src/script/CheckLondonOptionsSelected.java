package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.EnetrTimeTrackPage;
import page.LoginPage;
import page.UserListPage;

public class CheckLondonOptionsSelected extends BaseTest {
@Test
public void checkLondonOptionsSelected() throws Exception {
	String un = FWUtil.getXLData(XL_PATH, "CheckLondonOptionsSelected", 1,0);
	String pw = FWUtil.getXLData(XL_PATH, "CheckLondonOptionsSelected", 1,1);
	//String title1 = FWUtil.getXLData(XL_PATH, "CheckLondonOptionsSelected", 2,2);
	String title = FWUtil.getXLData(XL_PATH, "CheckLondonOptionsSelected", 1,2);
	//Enter valid user name
	LoginPage l = new LoginPage(driver);
	l.setUserName(un);
	//Enter valid password
	l.setPassword(pw);
	//click login button
	l.clickLogin();
	Thread.sleep(3000);
	//click on user list img(module)
	EnetrTimeTrackPage e = new EnetrTimeTrackPage(driver);
	e.clickUserListIMG();
	Thread.sleep(2000);
	//verify userlist page is displayed
	UserListPage u = new UserListPage(driver);
	u.verifyUserListPageIsDisplayed(driver, title, ETO);
	//click on timezone dropdownlist in Userslist page
	u.clicktimeZoneDDl();
	//select radio buton
	u.clickRadioButton();
	//deselect all check box
	u.clickDeselectCB();
	//select london users checkbox
	u.clickLondonCheckBox();
	// click on apply button
	u.clickApplyButton();
	
}
}

