package _02_SeleniumTesting;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_StatusOfElement extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement tuesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println(tuesday.isDisplayed()); //Görünüyor mu?
        System.out.println(tuesday.isEnabled()); // Aktif Mi?
        System.out.println(tuesday.isSelected()); // Seçili mi?

        tuesday.click();

        System.out.println(tuesday.isSelected());

        BekleKapat();
    }
}
