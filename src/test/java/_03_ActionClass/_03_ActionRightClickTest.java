package _03_ActionClass;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionRightClickTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");

        WebElement rightClickMe = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
        ElementToClickable(rightClickMe);

        Actions actions = new Actions(driver);

        Action aksiyon = actions.moveToElement(rightClickMe).contextClick(rightClickMe).build();
        aksiyon.perform();


        BekleKapat();
    }
}
