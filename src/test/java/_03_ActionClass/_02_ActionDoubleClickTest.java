package _03_ActionClass;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionDoubleClickTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickMe = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
        ElementToClickable(doubleClickMe);

        Actions actions = new Actions(driver);

        Action aksiyon = actions.moveToElement(doubleClickMe).doubleClick(doubleClickMe).build();
        aksiyon.perform();


        BekleKapat();
    }
}
