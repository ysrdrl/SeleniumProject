package _05_Alerts;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_AlertPart3 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/alerts");

        WebElement clickMe1 = driver.findElement(By.id("promtButton"));
        clickMe1.click();
        driver.switchTo().alert().sendKeys("DENEME123");
        driver.switchTo().alert().accept();


        BekleKapat();

    }
}
