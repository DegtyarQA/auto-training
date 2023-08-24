package lesson6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElementTest extends HelperDriver {


    @Test
    public void checkQuantityElementsAfterOperationAddDeleteTest(){
        addRemoveElements.getUrl();
        addRemoveElements.addElement();
        addRemoveElements.addElement();
        addRemoveElements.deleteElement();
        int countElem = addRemoveElements.countElements();
        Assert.assertEquals(countElem, 1, "Count element incorrect!");
    }
}
