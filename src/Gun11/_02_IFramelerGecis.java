package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFramelerGecis extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

        driver.switchTo().parentFrame();
        driver.switchTo().frame(1);
        WebElement menu =driver.findElement(By.id("animals"));
        Select ddmenu=new Select(menu);
        ddmenu.selectByVisibleText("Big Baby Cat");






        WaitQuit();
    }
}
