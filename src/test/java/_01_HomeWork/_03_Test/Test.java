package _01_HomeWork._03_Test;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.etsy.com/");

        WebElement jevellery = driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement necklaces = driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bibNecklaces = driver.findElement(By.id("catnav-l3-10881"));

        Actions actions = new Actions(driver);
        ElementToClickable(jevellery);
        Action aksiyon = actions
                .moveToElement(jevellery)
                .build();
        aksiyon.perform();

        ElementToClickable(necklaces);
        aksiyon = actions.moveToElement(necklaces)
                .build();
        aksiyon.perform();


        ElementToClickable(bibNecklaces);
        aksiyon = actions.moveToElement(bibNecklaces)
                .build();
        aksiyon.perform();

        bibNecklaces.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("bib"));


        BekleKapat();
    }
}
