package _01_HomeWork._01_Test;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Test extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();


        itemClick("Sauce Labs Bolt T-Shirt");

        WebElement addToCard = driver.findElement(By.className("btn_inventory"));
        ElementToClickable(addToCard);
        addToCard.click();

        WebElement backToProduct = driver.findElement(By.id("back-to-products"));
        ElementToClickable(backToProduct);
        backToProduct.click();


        itemClick("Sauce Labs Backpack");
        WebElement addTocard2 = driver.findElement(By.className("btn_inventory"));
        ElementToClickable(addTocard2);
        addTocard2.click();

        WebElement shopping = driver.findElement(By.className("shopping_cart_link"));
        shopping.click();

        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Deneme");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("denem2");

        WebElement postCode = driver.findElement(By.id("postal-code"));
        postCode.sendKeys("0061");

        WebElement continuee = driver.findElement(By.id("continue"));
        continuee.click();

        List<WebElement> price = driver.findElements(By.className("inventory_item_price"));
        double toplam = 0;
        for (int i = 0; i < price.size(); i++) {

            toplam += Double.parseDouble(price.get(i).getText().replaceAll("[$]", ""));

        }
        System.out.println("Toplam:" + Double.toString(toplam));

        WebElement itemtotal = driver.findElement(By.className("summary_subtotal_label"));
        System.out.println("İtem Total:" + itemtotal.getText().replaceAll("[a-z,A-Z,\\$,\\:, ,]", ""));

        Assert.assertEquals(Double.toString(toplam), itemtotal.getText().replaceAll("[a-z,A-Z,\\$,\\:, ,]", ""));

        WebElement finish= driver.findElement(By.id("finish"));
        ElementToClickable(finish);
        ElementToSccroll(finish);
        finish.click();

        WebElement dogrulama= driver.findElement(By.className("complete-header"));
        Assert.assertEquals(dogrulama.getText(),"THANK YOU FOR YOUR ORDER");

        BekleKapat();
    }

    public static void itemClick(String name) {
        List<WebElement> elements = driver.findElements(By.className("inventory_item_name"));

        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
            ElementToClickable(elements.get(i));
            if (elements.get(i).getText().equals(name)) {
                System.out.println("Eleman Name:" + elements.get(i).getText());
                elements.get(i).click();
                break;
            }
        }

    }
}
