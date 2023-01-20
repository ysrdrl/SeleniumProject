package _03_ActionClass;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionTusKontrolSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/auto-complete");

        WebElement input= driver.findElement(By.xpath("//div[contains(@class,'auto-complete__value-container--is-multi')]"));

        Actions actions = new Actions(driver);

        Action aksiyon=actions.moveToElement(input).click(input)
                .keyDown(Keys.SHIFT)
                .sendKeys("Y")
                .keyUp(Keys.SHIFT)
                .sendKeys("aşar")
                .build();
        aksiyon.perform();



    }
}
