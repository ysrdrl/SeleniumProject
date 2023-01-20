package _07_IFrame;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseStaticDriver {
    public static void main(String[] args) {

        /*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */

        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0);//IFrame'ler index'e göre dizilidir.(1.IFrame 0. Index)
        WebElement topic = driver.findElement(By.cssSelector("#topic ~input"));
        topic.sendKeys("Türkiye");

        driver.switchTo().frame(0);
        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement selectMenu = driver.findElement(By.id("animals"));

        Select ddmenu = new Select(selectMenu);
        ddmenu.selectByIndex(ddmenu.getOptions().size() - 1);

        BekleKapat();
    }
}
