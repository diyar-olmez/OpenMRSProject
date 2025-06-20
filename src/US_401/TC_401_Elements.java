package US_401;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_401_Elements {
    public TC_401_Elements() {PageFactory.initElements(BaseDriver.driver,this);}

    @FindBy(xpath="//*[@class='menu-item tg-header-button-wrap tg-header-button-one']")
    public WebElement demo;

    @FindBy(xpath="//*[text()='Explore OpenMRS 2']")
    public WebElement explore;

    @FindBy(xpath="//*[text()='Enter the OpenMRS 2 Demo']")
    public WebElement explore2;

    @FindBy(id="username")
    public WebElement username;

    @FindBy(id ="password")
    public WebElement password;

    @FindBy(id="loginButton")
    public WebElement login;

    @FindBy(id="Inpatient Ward")
    public WebElement inpatient;

    @FindBy(id = "sessionLocationError")
    public WebElement location;


}
