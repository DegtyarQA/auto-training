package lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.module.FindException;

public class CheckBoxesHelper extends HelperDriver {

    public static final String CHECKBOX_URL = "http://the-internet.herokuapp.com/checkboxes";
    WebDriver browser;

    public CheckBoxesHelper(WebDriver browser) {
        this.browser = browser;
    }

    public CheckBoxesHelper openCheckBoxPage() {
        browser.get(CHECKBOX_URL);
        return this;
    }

    public void actionCheckBox(int index) {
        browser.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
    }

    public boolean checkBoxStatus(int index) {
        if (browser.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected()) {
            return true;
        } else return false;
    }
}