package org.example;

import org.openqa.selenium.By;

public class ShopingCardPage {
    //Вспомогательные методы страницы корзины
        public static void openShopingCardPage() {
        Driver.browser.get("https://www.sharelane.com/cgi-bin/main.py");
        Driver.browser.findElement(By.partialLinkText("Shopping Cart")).click();
    }
}
