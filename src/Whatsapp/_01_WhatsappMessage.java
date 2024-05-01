package Whatsapp;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class _01_WhatsappMessage extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {

        DriverStart();
        String[] phones={"+905422170069","+905526821094"};

        Robot rbt=new Robot();
        int i=0;
        while (i<2) {
            driver.get("https://wa.me/" + phones[i].toString());

            WebElement startChat = driver.findElement(By.id("action-button"));
            startChat.click();
            Wait(2);
            WebElement useWhatsWeb = driver.findElement(By.partialLinkText("use WhatsApp Web"));
            useWhatsWeb.click();
            Wait(6);
            WebElement addButton = driver.findElement(By.cssSelector("span[data-icon='attach-menu-plus']"));
            addButton.click();
            Wait(6);
            WebElement attachImage = driver.findElement(By.xpath("//span[text()='Photos & Videos']"));
            attachImage.click();
            StringSelection stringSelection = new StringSelection("C:\\Users\\musac\\Downloads\\Resim_1.jpg");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            Wait(1);
            rbt.keyPress(KeyEvent.VK_CONTROL);
            rbt.keyPress(KeyEvent.VK_V);
            rbt.keyPress(KeyEvent.VK_ENTER);
            Wait(3);

            WebElement sendMessage = driver.findElement(By.cssSelector("div[class='to2l77zo gfz4du6o ag5g9lrv fe5nidar kao4egtt']"));
            sendMessage.sendKeys("Çok değerli");
            rbt.keyPress(KeyEvent.VK_SHIFT);
            rbt.keyPress(KeyEvent.VK_ENTER);
            sendMessage.sendKeys("*Meydan Butik Ailesi Velimiz,*");
            rbt.keyPress(KeyEvent.VK_SHIFT);
            rbt.keyPress(KeyEvent.VK_ENTER);
            sendMessage.sendKeys("Bursluluk sınavı ile alakalı.");


            Wait(5);
            rbt.keyPress(KeyEvent.VK_ENTER);
            Actions aksiyonlar = new Actions(driver);

            Action aksiyon = aksiyonlar.sendKeys(Keys.ENTER).build();
            aksiyon.perform();
            Wait(2);
            i++;
        }
    }
}
