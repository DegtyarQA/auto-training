package lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementHelper extends HelperDriver {

    WebDriver browser;
    public static final String ADD_REM_URL = "http://the-internet.herokuapp.com/add_remove_elements/";

    public AddRemoveElementHelper(WebDriver browser) {
        this.browser = browser;
    }

    public AddRemoveElementHelper getUrl() {
        browser.get(ADD_REM_URL);
        return this;
    }

    public void addElement() {
        browser.findElement(By.xpath("//button[text()='Add Element']")).click();
    }

    public void deleteElement() {
        browser.findElement(By.xpath("//button[text()='Delete']")).click();
    }

    public int countElements() {
        return browser.findElements(By.xpath("//button[text()='Delete']")).size();

    }
}

