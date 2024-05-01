package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _09_DragAndDropBy extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement element= driver.findElement(By.cssSelector("div[id='slider-range']>div+span"));

        Actions aksiyonlar=new Actions(driver);

        Action aksiyon=aksiyonlar.dragAndDropBy(element,100,0).build();
        aksiyon.perform();
    }
}
