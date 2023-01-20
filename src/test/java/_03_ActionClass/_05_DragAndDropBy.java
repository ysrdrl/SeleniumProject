package _03_ActionClass;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_DragAndDropBy extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");


       WebElement leftSlider=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[1]"));

        Actions actions = new Actions(driver);

        Action aksiyon = actions.dragAndDropBy(leftSlider, -101, 0).build();
        aksiyon.perform();


        BekleKapat();

    }
}
