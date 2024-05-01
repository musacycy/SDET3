package Gun04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _00_Ornek extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://wa.me/905422170069");
        WebElement btn =driver.findElement(By.id("action-button"));
        btn.click();
        WebElement txt=driver.findElement(By.linkText("use WhatsApp Web"));
        txt.click();


        Wait(36);
    }
}
