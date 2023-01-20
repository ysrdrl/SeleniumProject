package _03_ActionClass;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.WeakHashMap;

public class _08_ActionHoverOverTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.etsy.com/");

        List<WebElement> menuList = driver.findElements(By.cssSelector("span[id^='catnav-primary-link-']"));

        Actions actions = new Actions(driver);
        Action aksiyon;

        for (int i = 0; i < menuList.size(); i++) {

            aksiyon = actions.moveToElement(menuList.get(i)).build();
            aksiyon.perform();
            Bekle(1);
        }


        BekleKapat();

    }
}
