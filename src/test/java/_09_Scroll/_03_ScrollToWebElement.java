package _09_Scroll;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://triplebyte.com/");

        JavascriptExecutor js= (JavascriptExecutor) driver;

        WebElement element=driver.findElement(By.linkText("About"));
        js.executeScript("arguments[0].scrollIntoView()", element); // elemente kadar scroll yapar

        js.executeScript("arguments[0].click()", element); // elemente click yapma

        BekleKapat();



    }
}
