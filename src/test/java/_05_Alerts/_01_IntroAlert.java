package _05_Alerts;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01_IntroAlert extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/alerts");

        WebElement clickMe1=driver.findElement(By.id("alertButton"));
        clickMe1.click();
        driver.switchTo().alert().dismiss();

        Duration duration = Duration.ofSeconds(6);

        WebElement clickMe2= driver.findElement(By.id("timerAlertButton"));
        clickMe2.click();
        getWait().until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().dismiss();


        BekleKapat();

    }
}
