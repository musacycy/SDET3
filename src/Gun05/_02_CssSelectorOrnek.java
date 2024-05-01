package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_CssSelectorOrnek extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("http://demoqa.com/text-box");
        Wait(2);
        WebElement element=driver.findElement(By.cssSelector("[id='userName-wrapper']>div+div>input"));
        element.sendKeys("Automation");
        Wait(2);
        WebElement element2=driver.findElement(By.cssSelector("[id='userEmail-wrapper']>div+div>input"));
        element2.sendKeys("Testing");
        Wait(2);
        WebElement element3=driver.findElement(By.cssSelector("[id='currentAddress-wrapper']>div+div>textarea"));
        element3.sendKeys("Testing Current Address");
        Wait(2);
        WebElement element4=driver.findElement(By.cssSelector("[id='permanentAddress-wrapper'] textarea"));
        element4.sendKeys("Testing Permanent Address");
        Wait(2);
        WebElement element5=driver.findElement(By.cssSelector("[id='userForm'] button"));
        element5.click();
        Wait(2);

    }
}
