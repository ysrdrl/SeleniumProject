package _03_ActionClass;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionClickTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");

        WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
        ElementToClickable(clickMe);

        Actions actions = new Actions(driver);

        Action aksiyon = actions.moveToElement(clickMe).click(clickMe).build();
        aksiyon.perform();


        BekleKapat();
    }
}
