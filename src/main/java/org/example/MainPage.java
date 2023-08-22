package org.example;

import org.openqa.selenium.By;

////Вспомогательные методы главной страницы
public class MainPage {

    public static void LoginFromMainPage(String email, String password) {
        Driver.browser.get("https://www.sharelane.com/cgi-bin/main.py");
        Driver.browser.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        Driver.browser.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        Driver.browser.findElement(By.xpath("//input[@value='Login']")).click();
    }
}
