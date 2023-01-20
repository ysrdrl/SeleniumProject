package _07_IFrame;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);//IFrame'ler index'e göre dizilidir.(1.IFrame 0. Index)
        WebElement topic = driver.findElement(By.cssSelector("#topic ~input"));
        topic.sendKeys("Deneme");

//        driver.switchTo().parentFrame();//Bir basamak geri gider.
//        driver.switchTo().defaultContent();//Anasayfaya geri döner

        BekleKapat();
    }
}
