package _03_ActionClass;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _04_ActionDragAndDropTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        List<WebElement> cities = driver.findElements(By.cssSelector("div[class='dragableBox'][id*='box']"));
        List<WebElement> countries = driver.findElements(By.cssSelector("div[class='dragableBoxRight'][id*='box']"));

        Actions actions = new Actions(driver);

        for (int i = 0; i < cities.size(); i++) {
            for (int j = 0; j < countries.size(); j++) {
                Action aksiyon = actions.dragAndDrop(cities.get(i), countries.get(j)).build();
                aksiyon.perform();
                System.out.println(cities.get(i).getCssValue("background-color"));

                if (cities.get(i).getCssValue("background-color").equals("rgba(0, 255, 0, 1)")) {
                    break;

                }

            }

        }


        BekleKapat();

    }
}
