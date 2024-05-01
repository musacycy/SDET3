package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionClickTest extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://demoqa.com/buttons");

        WebElement element= driver.findElement(By.xpath("//button[text()='Click Me']"));
        Actions aksiyonlar =new Actions(driver);
        System.out.println("Aksiyonlar öncesi Aksiyonlar sınıfı oluşturuldu");
        Action aksiyon=aksiyonlar.moveToElement(element).click().build();
        System.out.println("Aksiyon hazırlandı");
        Wait(2);
        aksiyon.perform();
        System.out.println("Aksiyon gerçekleşti");
        WaitQuit();
        }

}
