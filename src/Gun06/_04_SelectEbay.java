package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_SelectEbay extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://www.ebay.com/");
        Wait(2);
        WebElement menu= driver.findElement(By.id("gh-cat"));
        menu.click();
        Wait(2);
        Select ddmenu=new Select(menu);

        ddmenu.selectByValue("14339");

        WebElement searchButton= driver.findElement(By.id("gh-btn"));
        searchButton.click();
    }
}
