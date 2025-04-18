package org.example.test;

import io.qameta.allure.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.base.CommanToAlltest;
import org.example.base.DashboadPage;
import org.example.base.LoginPage;
import org.example.listeners.RetryAnalyzer;
import org.example.listeners.ScreenshotListener;
import org.example.util.PropertiesReader;
import org.openqa.selenium.devtools.v133.preload.model.PreloadPipelineId;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.example.driver.DriverManager.getDriver;


@Listeners(ScreenshotListener.class)
@Test(retryAnalyzer = RetryAnalyzer.class)
public class Test_Vwo_Login extends CommanToAlltest
{
    public static final Logger logger = LogManager.getLogger(Test_Vwo_Login.class);
    @Description("Verify that vwo login successfully")
    @Test
    public void test_vwo_login()
    {
        logger.info("Test case started");
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginToVwo(PropertiesReader.readKey("validemail"),PropertiesReader.readKey("validpassword"));

        DashboadPage dashboadPage = new DashboadPage(getDriver());
        String loggedInVwo=dashboadPage.vwoDashboardLogin();

        Assert.assertEquals(loggedInVwo,PropertiesReader.readKey("expected"));
        logger.info("Test case executed successfully");
    }

}
