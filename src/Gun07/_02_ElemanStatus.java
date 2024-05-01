package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ElemanStatus extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement elementStatus= driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        System.out.println(elementStatus.isSelected());
        System.out.println(elementStatus.isDisplayed());
        System.out.println(elementStatus.isEnabled());
        Wait(2);
        elementStatus.click();
        Wait(2);
        System.out.println(elementStatus.isSelected());

    }
}
