import org.example.Driver;
import org.example.RegisterPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest {


    @Test
    public void verifyRegistrationSuccessfullyTest(){
        RegisterPage.stepEnterZIPcode();
        RegisterPage.fillFormRegistration();
        String successMsg = Driver.browser.findElement(By.className("confirmation_message")).getText();
        Assert.assertEquals(successMsg,"Account is created!", "Incorrect success message!!!");
        Driver.browser.quit();
    }

    @Test
    public void verifyRegistrationWithoutSetEmail(){
        RegisterPage.stepEnterZIPcode();
        RegisterPage.fillFormRegistrationWitgoutEmail();
        String errorMsg = Driver.browser.findElement(By.className("error_message")).getText();
        Assert.assertEquals(errorMsg,"Oops, error on page. Some of your fields have invalid data or email was previously used", "Incorrect error message!!!");
        Driver.browser.quit();
    }
}
