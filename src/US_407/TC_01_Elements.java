package US_407;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_01_Elements {



    public TC_01_Elements () {
        PageFactory.initElements(BaseDriver.driver,this);

    }
    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "Inpatient Ward")
    public WebElement inpatientWard;

    @FindBy(id = "loginButton")
    public WebElement loginBTN;

    @FindBy(id = "coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")
    public WebElement findPatientRecord;

    @FindBy(xpath = "//tbody[@role='alert']//tr[1]")
    public WebElement firstPatient;

    @FindBy(id = "patient-search")
    public WebElement searchBtn;

    @FindBy(id = "org.openmrs.module.coreapps.deletePatient")
    public WebElement deletePatiens;

    @FindBy(id = "delete-reason")
    public WebElement deleteReason;

    @FindBy(xpath = "(//*[text()='Confirm'])[4]")
    public WebElement confirmDelete;

    @FindBy(xpath = "//*[contains(text(), 'successfully')]")
    public WebElement successfulDelete;

}
