package lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownHelper {
    public static final String DROPDOWN_URL = "http://the-internet.herokuapp.com/dropdown";
    WebDriver browser;
    WebElement dropdown;
    Select select;

    public DropdownHelper(WebDriver browser) {
        this.browser = browser;
    }

    public DropdownHelper openDropDownPage() {
        browser.get(DROPDOWN_URL);
        return this;
    }

    public Select getDropdown() {
        dropdown = browser.findElement(By.id("dropdown"));
        select = new Select(dropdown);
        return select;
    }

    public String getElement(int index) {
        getDropdown();
        List<WebElement> allOptions = select.getOptions();
        String option = allOptions.get(index).getText();
        return option;
    }

    public Boolean selectElement(String value, int number) {
        getDropdown();
        select.selectByValue(value);
        List<WebElement> elements = select.getOptions();
        Boolean elSel = elements.get(number).isSelected();
        return elSel;
    }
}
