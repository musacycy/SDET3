package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */

public class _03_IFrameSoru extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");
        driver.switchTo().frame(0);
        WebElement chckBox= driver.findElement(By.id("a"));
        chckBox.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement menu =driver.findElement(By.id("animals"));
        Select ddmenu=new Select(menu);
        ddmenu.selectByIndex(ddmenu.getOptions().size()-1);


        WaitQuit();
    }
}
