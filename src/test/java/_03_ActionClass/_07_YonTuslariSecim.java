package _03_ActionClass;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_YonTuslariSecim extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/auto-complete");

        WebElement input= driver.findElement(By.xpath("//div[contains(@class,'auto-complete__value-container css-1hwfws3')]"));

        Actions actions = new Actions(driver);

        Action aksiyon = actions.moveToElement(input)
                .click()
                .sendKeys("B")
                .build();
        aksiyon.perform();

        Bekle(2);

        aksiyon=actions
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build();
        aksiyon.perform();

        BekleKapat();

    }
}
