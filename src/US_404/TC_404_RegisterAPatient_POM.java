package US_404;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_404_RegisterAPatient_POM extends BaseDriver {

    @Test(dataProvider = "datalarim", groups = {"Regression"})
    public void registerAPatient(String username , String password)
    {
        LogTutma.info("registerAPatient testi basladi");

        TC_404_RegisterAPatient_Elementleri rp = new TC_404_RegisterAPatient_Elementleri();

        driver.get("https://o2.openmrs.org/openmrs/login.htm");

        rp.userName.sendKeys(username);
        rp.passWord.sendKeys(password);
        rp.inpatientWard.click();
        rp.loginButton.click();
        rp.registerPatient.click();
        rp.firstName.sendKeys("Johan");
        rp.familyName.sendKeys("Cruijff");
        rp.nextBttn.click();
        rp.gender.click();
        rp.nextBttn.click();
        rp.birthDay.sendKeys("01");
        rp.birthMonth.click();
        rp.birthYear.sendKeys("1950");
        rp.nextBttn.click();
        rp.address.sendKeys("Dam Square");
        rp.city.sendKeys("Amsterdam");
        rp.country.sendKeys("Netherlands");
        rp.nextBttn.click();
        rp.patientPhoneNumber.sendKeys("020123456");
        rp.nextBttn.click();
        rp.relationType.click();
        rp.personName.sendKeys("Nistelrooy");
        rp.nextBttn.click();
        rp.confirm.click();

        MyFunc.Bekle(2);

        WebElement hastaIsmi=driver.findElement(By.cssSelector("[class='PersonName-familyName']"));
        WebElement hastaID= driver.findElement(By.xpath("//*[text()='Patient ID']"));


        Assert.assertTrue(hastaIsmi.getText().contains("Cruijff") , "Boyle bir isim ile bir kayit yok");
        Assert.assertTrue(hastaID.getText().contains("Patient ID") , "Boyle bir ID ile bir kayit yok");

        System.out.println("Isim = " + hastaIsmi.getText());
        System.out.println("ID = " + hastaID.getText());

        LogTutma.info("registerAPatient testi bitti");
    }

    @DataProvider
    Object[] datalarim(){
        Object[][] bilgiler={{"Admin","Admin123"}};

        return bilgiler;
    }

}
