package Gun06;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_SelectClassGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://www.amazon.com/");

        WebElement menu =driver.findElement(By.id("searchDropdownBox"));
        Select ddmenu=new Select(menu);
        ddmenu.selectByVisibleText("Books");
        WebElement serachButton= driver.findElement(By.id("nav-search-submit-button"));
        serachButton.click();
        String url= driver.getCurrentUrl();
        Assert.assertTrue(url.contains("amazon1"));
    }
}
