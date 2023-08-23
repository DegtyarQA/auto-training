package org.example;

import org.openqa.selenium.By;

public class RegisterPage {
    //Вспомогательные методы страницы регистрации
    public static void stepEnterZIPcode(){
        Driver.browser.get("https://www.sharelane.com/cgi-bin/register.py");
        Driver.browser.findElement(By.xpath("//input[@name='zip_code']")).sendKeys("12345");
        Driver.browser.findElement(By.xpath("//input[@value='Continue']")).click();
    }

    public static void fillFormRegistration(){
        stepEnterZIPcode();
        Driver.browser.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Test");
        Driver.browser.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Testovy");
        Driver.browser.findElement(By.xpath("//input[@name='email']")).sendKeys("test1@test.com");
        Driver.browser.findElement(By.xpath("//input[@name='password1']")).sendKeys("Qwe123");
        Driver.browser.findElement(By.xpath("//input[@name='password2']")).sendKeys("Qwe123");
        Driver.browser.findElement(By.xpath("//input[@value='Register']")).click();
    }

    public static void fillFormRegistrationWitgoutEmail(){
        stepEnterZIPcode();
        Driver.browser.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Ivan");
        Driver.browser.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Ivanov");
        Driver.browser.findElement(By.xpath("//input[@name='password1']")).sendKeys("Qwe124");
        Driver.browser.findElement(By.xpath("//input[@name='password2']")).sendKeys("Qwe124");
        Driver.browser.findElement(By.xpath("//input[@value='Register']")).click();
    }
}
