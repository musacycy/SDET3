package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _03_ActionHoverOverTest extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://www.etsy.com/");
        List<WebElement> cookiesAccept=driver.findElements(By.cssSelector("[data-gdpr-single-choice-accept='true']"));
        if (cookiesAccept.size() > 0)
            cookiesAccept.get(0).click();

        WebElement element= driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement element1= driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement element2= driver.findElement(By.id("catnav-l3-10881"));

        Actions aksiyonlar =new Actions(driver);

        Action aksiyon=aksiyonlar
                .moveToElement(element)
                .build();
        aksiyon.perform();
        Wait(1);
        aksiyon=aksiyonlar
                .moveToElement(element1)
                .build();
        aksiyon.perform();
        Wait(1);
        aksiyon=aksiyonlar
                .moveToElement(element2)
                .click()
                .build();
        aksiyon.perform();

        WaitQuit();
    }
}
