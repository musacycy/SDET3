package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;
/*
   1- https://www.selenium.dev/  sayfasına gidiniz
   2- Sayfadaki bütün yeni sayfa açan linkleri tıklatınız(mailto hariç)
   3- Açılan bütün yeni sayfaları teer teker kapatınız
 */

public class _03_WindowsClosing extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://www.selenium.dev/");

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        for(WebElement link:linkler){
            if(!link.getAttribute("href").contains("mailto"))
                link.click();
        }
        Set<String> windowId=driver.getWindowHandles();
        for (String id:windowId){

            driver.switchTo().window(id);
            Wait(2);
            driver.close();


        }
    }
}
