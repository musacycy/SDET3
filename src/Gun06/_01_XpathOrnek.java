package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import java.util.List;

public class _01_XpathOrnek extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://www.saucedemo.com/");
        Wait(2);
        WebElement element=driver.findElement(By.xpath("//*[@id='user-name']"));
        element.sendKeys("standard_user");
        Wait(2);
        WebElement element1=driver.findElement(By.xpath("//*[@id='password']"));
        element1.sendKeys("secret_sauce");
        Wait(2);
        WebElement element2=driver.findElement(By.xpath("//*[@id='login-button']"));
        element2.click();
        Wait(2);
        WebElement element4=driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        element4.click();
        Wait(2);
        WebElement element5=driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"));
        element5.click();
        Wait(2);
        WebElement element6=driver.findElement(By.xpath("//*[@id='back-to-products']"));
        element6.click();
        Wait(2);
        WebElement element7=driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']"));
        element7.click();
        Wait(2);
        WebElement element8=driver.findElement(By.xpath("//*[@name='add-to-cart-sauce-labs-bolt-t-shirt']"));
        element8.click();
        Wait(2);
        WebElement element9=driver.findElement(By.xpath("//*[@id='shopping_cart_container']//a"));
        element9.click();
        Wait(2);
        WebElement element10=driver.findElement(By.xpath("//button[text()='Checkout']"));
        element10.click();
        WebElement element11=driver.findElement(By.xpath("//*[@id='first-name']"));
        element11.sendKeys("Musa");
        Wait(2);
        WebElement element12=driver.findElement(By.xpath("//*[@id='last-name']"));
        element12.sendKeys("Ahmet");
        Wait(2);
        WebElement element13=driver.findElement(By.xpath("//*[@id='postal-code']"));
        element13.sendKeys("34000");
        Wait(2);
        WebElement element14=driver.findElement(By.xpath("//*[@id='continue']"));
        element14.click();
        List<WebElement> ucretler=driver.findElements(By.xpath("//*[@class='inventory_item_price']"));
        double toplam=0;
        for(WebElement e:ucretler) {
            System.out.println("ücretler" + e.getText());
            toplam+=Double.parseDouble(e.getText().substring(1));
        }
        System.out.println("toplam = " + toplam);
        WebElement element15=driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));
        double alttoplam=0;
        alttoplam+=Double.parseDouble(element15.getText().substring(13));
        System.out.println("alttoplam = " + alttoplam);
        if(toplam==alttoplam)
        {
            System.out.println("test passed");
        }
        else System.out.println("Test failed" );

        Assert.assertTrue(toplam==alttoplam);


    }
}
