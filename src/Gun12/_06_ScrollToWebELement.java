package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _06_ScrollToWebELement extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js =(JavascriptExecutor) driver;
        WebElement element= driver.findElement(By.linkText("Take a quiz"));
        js.executeScript("arguments[0].scrollIntoView()",element);

        js.executeScript("arguments[0].click()",element);


        WaitQuit();
    }
}
