package Gun13;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _01_RobotGiris extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        DriverStart();
        driver.get("https://demo.guru99.com/test/upload/");

        Robot rbt=new Robot();
        for (int i = 0; i < 13; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);//tuşa basıldı
            rbt.keyRelease(KeyEvent.VK_TAB);//tuş bırakıldı
            Wait(2);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyPress(KeyEvent.VK_ENTER);
        // Stringi hafızaya-clipboard a kopyalama kodu
        StringSelection stringSelection = new StringSelection("C:\\Users\\musac\\Desktop\\New folder\\New Text Document.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
        // Verilen stringi clipboard a set ediyor.

        Wait(1);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        Wait(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        for (int i = 0; i < 2; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        WebElement submitButton= driver.findElement(By.id("submitbutton"));
        submitButton.click();

        WebElement verify= driver.findElement(By.cssSelector("#res>center"));
        Assert.assertTrue(verify.getText().contains("has been successfully uploaded."));




        WaitQuit();

    }
}
