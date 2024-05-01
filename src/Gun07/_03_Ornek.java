package Gun07;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Ornek extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://www.facebook.com/");
        Wait(2);
        WebElement createAccount= driver.findElement(By.partialLinkText("Create New Account"));
        createAccount.click();
        Wait(2);
        WebElement firstName= driver.findElement(By.cssSelector("*[name='firstname']"));
        firstName.sendKeys("Musa");
        Wait(2);
        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Cici");
        Wait(2);
        WebElement emailConfirmation= driver.findElement(By.name("reg_email_confirmation__"));
        System.out.println(emailConfirmation.isDisplayed());
        Assert.assertFalse(emailConfirmation.isDisplayed());

        Wait(2);
        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("musacici@windowslive.com");
        Wait(2);
        System.out.println(emailConfirmation.isDisplayed());
        Assert.assertTrue(emailConfirmation.isEnabled());

    }
}
