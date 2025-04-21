package org.example.page;

import org.example.util.Waithelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboadPage {

    WebDriver driver;
    public DashboadPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[@data-qa='lufexuloga']")
    private WebElement dashboard;

    public String vwoDashboardLogin(){
      Waithelper.checkVisiblityOfElement(dashboard);
        return  dashboard.getText();
    }



}

