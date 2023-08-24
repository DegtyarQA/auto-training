package lesson6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends HelperDriver {

    @Test
    public void verifyOperationForCheckBoxTest() {
        checkBoxesHelper.openCheckBoxPage();
        Boolean box1 = checkBoxesHelper.checkBoxStatus(1);
        Assert.assertEquals(box1, false, "Checked!!!");
        checkBoxesHelper.actionCheckBox(1);
        box1 = checkBoxesHelper.checkBoxStatus(1);
        Assert.assertEquals(box1, true, "UnChecked!!!");
        Boolean box2 = checkBoxesHelper.checkBoxStatus(2);
        Assert.assertEquals(box2, true, "UnChecked!!!");
        checkBoxesHelper.actionCheckBox(2);
        box2 = checkBoxesHelper.checkBoxStatus(2);
        Assert.assertEquals(box2, false, "Checked!!!");
    }
}
