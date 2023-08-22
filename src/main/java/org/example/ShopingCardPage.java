package org.example;

import org.openqa.selenium.By;

public class ShopingCardPage {

        public static void openShopingCardPage() {
        Driver.browser.get("https://www.sharelane.com/cgi-bin/main.py");
        Driver.browser.findElement(By.partialLinkText("Shopping Cart")).click();
    }
}
