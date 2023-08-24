package lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class HelperDriver {

    public WebDriver browser;
    AddRemoveElementHelper addRemoveElements;
    CheckBoxesHelper checkBoxesHelper;
    DropdownHelper dropdownHelper;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--remote-allow-origins=*");
        browser = new ChromeDriver(chromeOptions);
        browser.manage().window().maximize();
        addRemoveElements= new AddRemoveElementHelper(browser);
        checkBoxesHelper = new CheckBoxesHelper(browser);
        dropdownHelper = new DropdownHelper(browser);
    }

    @AfterMethod
    public void tearDown(){
       browser.quit();
    }
}
