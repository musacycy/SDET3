package Gun08;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        Wait(2);
        WebElement clickMe3= driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));
        clickMe3.click();
        Wait(2);
        System.out.println(driver.switchTo().alert().getText());//alertin texti alındı
        driver.switchTo().alert().sendKeys("musa");//alertin text girişine musa gönderildi
        Wait(2);
        driver.switchTo().alert().accept();//alert kutucuğuna geçildi ve tamama basıldı
        WebElement txtActual= driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(txtActual.getText().contains("musa"));

        Wait(2);

        WaitQuit();
    }
}
