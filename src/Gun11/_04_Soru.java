package Gun11;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
/*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
 */

public class _04_Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
            WebElement firstNumber= driver.findElement(By.id("number1Field"));
            firstNumber.sendKeys("12");
            WebElement secondNumber= driver.findElement(By.id("number2Field"));
            secondNumber.sendKeys("24");
            WebElement clButton= driver.findElement(By.id("calculateButton"));
            clButton.click();
            WebElement ansField=driver.findElement(By.id("numberAnswerField"));
            System.out.println("ansField.getText() = " + ansField.getText());
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.attributeToBeNotEmpty(ansField, ansField.getText()));
            Assert.assertEquals(ansField.getText(),"36");






        WaitQuit();
    }
}
