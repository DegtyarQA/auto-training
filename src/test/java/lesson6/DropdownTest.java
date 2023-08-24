package lesson6;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DropdownTest extends HelperDriver {

    @Test
    public void verifyAvailabilityAllElementDropdownTest(){
        dropdownHelper.openDropDownPage();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(dropdownHelper.getElement(0), "Please select an option");
        softAssert.assertEquals(dropdownHelper.getElement(1), "Option 1");
        softAssert.assertEquals(dropdownHelper.getElement(2), "Option 2");
        softAssert.assertAll();
    }

    @Test
    public void verifySelectElementTest() {
        dropdownHelper.openDropDownPage();
        SoftAssert softAssertSel = new SoftAssert();
        softAssertSel.assertTrue(dropdownHelper.selectElement("1", 1));
        softAssertSel.assertTrue(dropdownHelper.selectElement("2", 2));
    }
}
