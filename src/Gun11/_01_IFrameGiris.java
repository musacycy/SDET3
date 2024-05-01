package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);// frame' e giriyor

        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");
        driver.switchTo().parentFrame();//bir frame geri gidiyor
        driver.switchTo().defaultContent();//ilk amasayfaya geri dön




        WaitQuit();
    }
}
