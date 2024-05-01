package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

/*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

    Bu işlem javascriptexecuter ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    hotels.com, https://p-del.co/
 */
public class _04_Scrollintro extends BaseStaticDriver {
    public static void main(String[] args) {
        DriverStart();
        driver.get("https://triplebyte.com/");
        //Javascript komutlarını çalıştırmak için js değişkeni tanımlandı

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        //(0,1500) -> (x,y) sayfayı x kadar sağa y kadar aşağı kaydırır
        // 1500 px kadar aşağıya kaydıracak

        Wait(2);

        js.executeScript("window.scrollBy(0,-1500)");



        WaitQuit();
    }
}
