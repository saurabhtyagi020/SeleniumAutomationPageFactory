package org.example.page;


import org.example.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommanToAlltest {

    @BeforeMethod
    public void setUp()
    {
        DriverManager.init();
    }

    @AfterMethod
    public  void down()
    {
        DriverManager.down();
    }
}
