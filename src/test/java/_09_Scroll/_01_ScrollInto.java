package _09_Scroll;

import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

public class _01_ScrollInto extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://triplebyte.com/");


        // JavaScript komutlarını çalıştırmak için önce js değişkeni tanımlandı.
        JavascriptExecutor js = (JavascriptExecutor) driver;


        js.executeScript( "window.scrollBy(0,1500)");
        // (0,1500) -> (x,y) Sayfayı sağa x kadar ve aşağı y kaydırır
        // 1500 px kadar aşağı kaydıracak.



        Bekle(2);
        js.executeScript( "window.scrollBy(0,-1500)");

        BekleKapat();



    }
}
