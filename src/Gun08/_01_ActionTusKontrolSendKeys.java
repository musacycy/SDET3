package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionTusKontrolSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://demoqa.com/auto-complete");

        WebElement element= driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon=aksiyonlar
                .moveToElement(element)//kutucuğa gittim
                .click()//içine tıkladım
                .keyDown(Keys.SHIFT)//shift tuşuna bastık
                .sendKeys("a")//küçük "a" tuşuna bastım ama SHIFT basılı olduğu için "A" yazdı
                .keyUp(Keys.SHIFT)//SHIFT tuşunu bıraktık
                .sendKeys("hmet")//kalanı küçük harf girdi
                .build();
        Wait(2);
        aksiyon.perform();

        WaitQuit();
    }
}
