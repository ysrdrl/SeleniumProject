package _01_HomeWork._02_Test;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.facebook.com/");

        WebElement createAccount = driver.findElement(By.cssSelector("a[id^='u_0_0_']"));
        ElementToClickable(createAccount);
        createAccount.click();


        Assert.assertFalse(driver.findElement(By.name("reg_email_confirmation__")).isDisplayed());

        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("deneme@gmail.com");

        Assert.assertTrue(driver.findElement(By.name("reg_email_confirmation__")).isDisplayed());

        BekleKapat();
    }
}
