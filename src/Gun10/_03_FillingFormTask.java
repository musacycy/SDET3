package Gun10;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */
public class _03_FillingFormTask extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");


        WebElement name= driver.findElement(By.id("title"));
        name.sendKeys("Musa");
        WebElement comments= driver.findElement(By.id("description"));
        comments.sendKeys("naber");
        
        WebElement btnSubmit= driver.findElement(By.id("btn-submit"));
        btnSubmit.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));
        
        WebElement btnText=driver.findElement(By.id("submit-control"));
        Assert.assertEquals("Form submited Successfully!",btnText.getText());

        WaitQuit();
    }
}
