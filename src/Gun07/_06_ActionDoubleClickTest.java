package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.tethering.model.Accepted;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionDoubleClickTest extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://demoqa.com/buttons");
        WebElement element= driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));

        Actions aksiyonlar=new Actions(driver);

        Action aksiyon=aksiyonlar.moveToElement(element).doubleClick().build();
        Wait(2);
        aksiyon.perform();
        WaitQuit();


    }
}
