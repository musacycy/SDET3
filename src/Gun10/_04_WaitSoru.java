package Gun10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */
public class _04_WaitSoru extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://www.demoblaze.com/index.html");

        WebElement element=driver.findElement(By.linkText("Samsung galaxy s6"));
        element.click();
        WebElement addToCart= driver.findElement(By.xpath("//*[@onclick='addToCart(1)']"));
        addToCart.click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        WebElement homePage=driver.findElement(By.id("nava"));
        homePage.click();





        WaitQuit();
    }
}
