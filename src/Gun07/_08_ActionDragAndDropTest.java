package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class _08_ActionDragAndDropTest extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement oslo= driver.findElement(By.xpath("//div[@id='box1']"));
        WebElement norway = driver.findElement(By.xpath("//div[@id='box101']"));

        Actions aksiyonlar= new Actions(driver);
        Action aksiyon=aksiyonlar.dragAndDrop(oslo,norway).build();
        aksiyon.perform();

        //2.yöntem
        WebElement seoul= driver.findElement(By.xpath("//div[@id='box5']"));
        WebElement korea = driver.findElement(By.xpath("//div[@id='box105']"));

        Actions aksiyonlar1= new Actions(driver);
        Action aksiyon1=aksiyonlar1.clickAndHold(seoul).moveToElement(korea).release().build();
        aksiyon1.perform();

        WaitQuit();
    }
}
