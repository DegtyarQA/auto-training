import org.example.Driver;
import org.example.MainPage;
import org.example.ShopingCardPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    //1 Открыть страницу https://www.sharelane.com/cgi-bin/main.py
    //2 Перейти по ссылке Shoping Cart
    //3 Проверить сообщение об ошибке

    @Test
    public void verifyGoToShoppingCartWithoutLoginTest() {
        ShopingCardPage.openShopingCardPage();
        String errorMsg = Driver.browser.findElement(By.className("error_message")).getText();
        Assert.assertEquals(errorMsg, "Oops, error. You must log in", "Incorrect error message!!!");
        Driver.browser.quit();
    }

    //1 Открыть главную страницу https://www.sharelane.com/cgi-bin/main.py
    //2 Заполнить поле email, данными которых нет в системе
    //3 Заполнить поле password, данными которых нет в системе
    //4 Нажать кнопку Login
    //5 проверить сообщение о неуспешном логине.

    @Test
    public void verifyLoginWithIncorrectCreadentials(){
        MainPage.LoginFromMainPage("fail@test.by", "555");
        String errorMsg = Driver.browser.findElement(By.className("error_message")).getText();
        Assert.assertEquals(errorMsg, "Oops, error. Email and/or password don't match our records", "Incorrect error message!!!");
    }
}