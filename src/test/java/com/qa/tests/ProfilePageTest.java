package com.qa.tests;

import com.qa.base.BaseTest;
import org.testng.annotations.Test;

public class ProfilePageTest extends BaseTest {


    @Test(groups = {"smoke"})
    public void updateUserName(){
        System.out.println("user name updated");
    }
}
