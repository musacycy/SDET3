package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelectorOrnek extends BaseStaticDriver {

    public static void main(String[] args) {
        DriverStart();
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        Wait(2);
        WebElement element=driver.findElement(By.cssSelector("input[id='u_1fG_4586_0']+span"));
        element.click();
        Wait(2);
        WebElement element1= driver.findElement(By.cssSelector("select[name='u_1fG_4588']"));
        element1.click();
        Wait(2);
        WebElement element2= driver.findElement(By.cssSelector("select[name='u_1fG_4588']>option[value='Online Advertising']"));
        element2.click();
        Wait(2);
        WebElement element3= driver.findElement(By.cssSelector("input[id='u_1fG_89585_0']+span"));
        element3.click();
        Wait(2);
        WebElement element4= driver.findElement(By.cssSelector("input[id='u_1fG_4589_0']+span"));
        element4.click();
        Wait(2);
        WebElement element5= driver.findElement(By.cssSelector("select[id='u_1fG_4597']>option:nth-child(4)"));
        element5.click();

    }
}
