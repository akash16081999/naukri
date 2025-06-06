package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.base.DriverFactory;
import com.qa.pages.LoginPage;
import com.qa.pages.NaukriEntryDashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    NaukriEntryDashboardPage ed;

    @Test(groups = {"smoke"})
    public void loginWithValidCredentials() {
        ed = new NaukriEntryDashboardPage(DriverFactory.getDr());
        LoginPage lp = ed.openNaukriLoginSlide();

        lp.loginToAccount();

       String Currenturl= DriverFactory.getDr().getCurrentUrl();
       Assert.assertEquals(Currenturl,"https://www.naukri.com/mnjuser/homepage");

    }

    @Test(groups = {"reg"})
    public void loginWithInvalidCredentials() {
        System.out.println("reg test");
    }

}
