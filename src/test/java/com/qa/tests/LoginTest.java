package com.qa.tests;

import com.qa.base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(groups = {"smoke"})
    public void loginNaukriTest() {
        System.out.println("smoke test");
    }

    @Test(groups = {"reg"})
    public void loginNaukriTest1() {
        System.out.println("reg test");
    }

}
