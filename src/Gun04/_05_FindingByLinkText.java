package Gun04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_FindingByLinkText extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://www.hepsiburada.com/");

        WebElement element=driver.findElement(By.linkText("Siparişlerim"));//sadece a taglerinde çalışır
        System.out.println(element.getText());

        System.out.println(element.getAttribute("title"));
        System.out.println(element.getAttribute("href"));
        System.out.println(element.getAttribute("rel"));
        WebElement element2=driver.findElement(By.partialLinkText("Süper Fiyat"));// sadece a taglerinde çalışır
        System.out.println(element2.getText());



        WaitQuit();
    }
}
