package _05_Alerts;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.Driver;
import java.time.Duration;

public class _02_AlertPart2 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/alerts");

        WebElement clickMe1 = driver.findElement(By.id("confirmButton"));
        clickMe1.click();
        driver.switchTo().alert().dismiss();


        BekleKapat();

    }
}
