package _06_Wait;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_FillingFormTask extends BaseStaticDriver {
    public static void main(String[] args) {

        /*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name = driver.findElement(By.id("title"));
        name.sendKeys("Deneme");

        WebElement comment = driver.findElement(By.id("description"));
        comment.sendKeys("Deneme123");

        WebElement submitButton = driver.findElement(By.id("btn-submit"));
        submitButton.click();

        WebElement text = driver.findElement(By.id("submit-control"));
        getWait().until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));

        Assert.assertEquals("Form submited Successfully!", text.getText());

        BekleKapat();
    }
}
