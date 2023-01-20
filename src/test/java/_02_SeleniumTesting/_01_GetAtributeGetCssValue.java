package _02_SeleniumTesting;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_GetAtributeGetCssValue extends BaseStaticDriver {

    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement searchBox = driver.findElement(By.id("inputValEnter"));


        System.out.println(searchBox.getText());
        //GetAtribute
        System.out.println(searchBox.getAttribute("autocomplete"));
        System.out.println(searchBox.getAttribute("onkeypress"));

        //GetCssValue
        System.out.println(searchBox.getCssValue("background"));
        System.out.println(searchBox.getCssValue("padding"));
        System.out.println(searchBox.getCssValue("margin"));


        BekleKapat();
    }
}
