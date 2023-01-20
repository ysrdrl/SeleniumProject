package _07_IFrame;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _02_IFramelerGecis extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);//IFrame'ler index'e göre dizilidir.(1.IFrame 0. Index)
        WebElement topic = driver.findElement(By.cssSelector("#topic ~input"));
        topic.sendKeys("Türkiye");

        driver.switchTo().defaultContent(); // Anasayfaya geri döner.

        driver.switchTo().frame(1);
        WebElement selectMenu = driver.findElement(By.id("animals"));

        Select ddmenu = new Select(selectMenu);
        ddmenu.selectByIndex(ddmenu.getOptions().size() - 1);

        BekleKapat();
    }
}
/*frame 0
        >subframe 0
        >subframe 1
frame 1*/
