package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _02_WindowsSwitch extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://www.selenium.dev/");

        String homePageid=driver.getWindowHandle();//bulunduğu sayfanın idsi

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        for(WebElement link:linkler){
            if(!link.getAttribute("href").contains("mailto"))
                link.click();
        }
        Set<String> windowId=driver.getWindowHandles();

        for (String id:windowId){
            if(id.equals(homePageid)) continue;
            System.out.println("id = " + id);
            driver.switchTo().window(id);
            System.out.println(id+"driver.getTitle() = " + driver.getTitle());
        }
        Wait(6);
        WaitQuit();

    }
}
